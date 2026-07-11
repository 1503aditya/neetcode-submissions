class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0,prod=1;
        for(int i : nums){
            if(i==0){
                zeroCount++;
            }else if(zeroCount==2){
                break;
            }
            else{
                prod=prod*i;
            }
        }
        System.out.println(prod + " " + zeroCount);
        for(int i=0;i<nums.length;i++){
            if(zeroCount>=2){
                nums[i]=0;
            }else if(nums[i]==0){
                nums[i]=prod;
            }else if(zeroCount==1){
                nums[i]=0;
            }else{
                System.out.println(nums[i]/prod);
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}  
