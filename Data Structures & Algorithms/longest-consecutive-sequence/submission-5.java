class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        //-1,-1,0,1,3,4,5,6,7,8,9
        int counter=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]+1==nums[i+1]){
                counter++;
                max=(int)Math.max(counter,max);
            }else if(nums[i]!=nums[i+1] && nums[i]+1!=nums[i+1]){
                counter=1;
            }
        }
        return max;
    }
}
