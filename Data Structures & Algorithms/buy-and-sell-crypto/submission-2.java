class Solution {
    public int maxProfit(int[] prices) {
        int minAmount=prices[0], target=0;
        for(int i=0;i<prices.length-1;i++){
            if(minAmount>prices[i]){
                minAmount=prices[i];
            }
            if(prices[i+1]-minAmount>0 && prices[i+1]-minAmount>target)
            target=prices[i+1]-minAmount;
        }
        return target;
    }
}
