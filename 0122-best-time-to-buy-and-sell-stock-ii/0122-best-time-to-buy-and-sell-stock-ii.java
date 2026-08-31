class Solution {
    public int maxProfit(int[] prices) {
        int profit1 = 0;
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
             profit1 = prices[i] - prices[i-1];
             maxProfit = maxProfit + profit1;
            }
        }
        return maxProfit;
    }
}