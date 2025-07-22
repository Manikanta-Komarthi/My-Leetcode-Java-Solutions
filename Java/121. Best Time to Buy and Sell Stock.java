//Best time to buy and sell stock to get max profit.
//using Sliding window and two pointer.

class Solution {
    public int maxProfit(int[] prices) {
     int max_profit=0;
     int left=0;
     int right=1;
     while(right<prices.length){
        if(prices[left]<prices[right]){
            int profit=prices[right]-prices[left];
            max_profit=Math.max(profit,max_profit);
        }
        else left=right;
        right+=1;
     }
     return max_profit; 
    }
}
