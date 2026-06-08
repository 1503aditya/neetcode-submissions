class Solution {
    public int findMin(int[] nums) {
        
        int start=0,end=nums.length-1,mid=0;
        if(nums[0]<nums[end])
        return nums[0];
        while(start<=end){
            if( nums[start]<=nums[end]){
                return nums[start];
            }
            mid=(end+start)/2;
            if(nums[mid]>=nums[end]){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return 0;
        
    }
}
