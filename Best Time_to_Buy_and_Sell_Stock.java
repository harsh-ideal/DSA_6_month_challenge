class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int max=0;
        int sell;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
                continue;
            }
            max=Math.max(max,prices[i]-buy);
        }

        return max;
    }
}


Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/