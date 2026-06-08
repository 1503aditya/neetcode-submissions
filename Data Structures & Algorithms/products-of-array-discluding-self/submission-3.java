class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0,product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            zeroCount++;
            if(zeroCount==2)
            break;
            if(nums[i]!=0 && zeroCount<=1){
                product=product*nums[i];
            }            
        }
        int arr[]=new int[nums.length];
        if(zeroCount==2){
            return arr;
        }
        for(int i=0;i<arr.length;i++){
            if(zeroCount==1 && nums[i]!=0)
            arr[i]=0;
            else if(zeroCount==1 && nums[i]==0)
            arr[i]=product;
            else
            arr[i]=product/nums[i];
        }
        return arr;
    }
}  
