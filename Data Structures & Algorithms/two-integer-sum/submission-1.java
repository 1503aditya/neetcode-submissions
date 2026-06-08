class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2],index=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=map.get(target-nums[i]);
                 arr[1]=i;
            }
            
            map.put(nums[i],index);
            index++;
        }
        return arr;
    }
}
