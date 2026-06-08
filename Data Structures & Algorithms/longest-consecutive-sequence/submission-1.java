class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int max=1,counter=1;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1])
            continue;
            if(i<nums.length-1 && nums[i]+1==nums[i+1])
            counter++;
            else
            counter=1;
            max=(int)Math.max(counter,max);
        }
        return max;
    }
}
