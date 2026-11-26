class Solution {
    public int maxProfit(int[] prices) {
        int MinPrices = prices[0];
        int MaxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            int profit = prices[i] - MinPrices;
            MaxProfit = Math.max(MaxProfit,profit);
            MinPrices = Math.min(MinPrices,prices[i]);
        }
        return MaxProfit;
    }
}