class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[mid]>=nums[l]){// Left side is sorted
                if(nums[mid]<target || nums[l]>target)//If target is in right side
                l=mid+1;
                else
                r=mid-1;
            }
            else{  //right side sorted
                if(nums[mid]>target || nums[r]<target)
                r=mid-1;
                else
                l=mid+1;
            }
            
        }
        return -1;
    }
}
