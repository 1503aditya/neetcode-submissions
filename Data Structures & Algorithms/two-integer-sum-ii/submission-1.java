class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        arr[0]=0;arr[1]=0;//j=0<1
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
        }
        return arr;
    }
}
