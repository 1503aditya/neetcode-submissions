class Solution {
    public int findMin(int[] nums) {
        
        int start=nums[0],end=nums[nums.length-1];
        if(start<end)
        return start;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
            return nums[i];
        }
        return nums[0];
        
    }
}
