class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end = Arrays.stream(piles).max().getAsInt();
        int k=start+end/2,hrs=0,res=end;//k==mid
        while(start<=end){
            k=(end+start)/2;hrs=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%k==0)
            hrs=hrs+piles[i]/k;
            else{
                hrs=hrs+piles[i]/k+1;
            }
        }
    
    if(hrs<=h){
        res=Math.min(res,k);
        end=k-1;
    }
    else if(hrs>h){
        start=k+1;
    }
    }
    return res;
}
}