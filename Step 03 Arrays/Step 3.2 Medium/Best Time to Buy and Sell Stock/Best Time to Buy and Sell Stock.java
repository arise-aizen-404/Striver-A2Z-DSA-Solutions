class Solution {
    public int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;++i) {
            min_value = Math.min(min_value, prices[i]);
            max_profit = Math.max(max_profit, (prices[i]-min_value));
        }
        return max_profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int dayToBuy = 0;
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int ind1=-1, ind2=-1;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
                ind1=i;
            }
            
            if(prices[i] - min > profit) {
                profit = prices[i] - min;
                ind2=i;
            }
        }
        System.out.println(ind1+" "+ind2);
        
        return profit;
    }
}