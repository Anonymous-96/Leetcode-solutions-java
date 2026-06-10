class BestTimeToBuyandSellStock_Leetcode_121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit=0;
        int minBuy = prices[0];
        for(int i=1;i<n;i++){
            int cost = prices[i]-minBuy;
            profit=Math.max(profit,cost);
            minBuy=Math.min(minBuy,prices[i]);
        }
        return profit;
    }

}