class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=n;
        while(sum!=1){
            n=sum;
            sum=0;
            while(n!=0){
                sum=sum+(int)Math.pow(n%10,2);
                n=n/10;
            }
            if(map.containsKey(sum))
            return false;
            else
            map.put(sum,1);
        }
        return true;
    }
}
