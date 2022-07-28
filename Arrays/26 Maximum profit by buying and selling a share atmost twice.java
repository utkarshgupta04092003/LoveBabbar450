/**************************************************************

In daily share trading, a buyer buys shares in the morning 
and sells them on the same day. If the trader is allowed to
make at most 2 transactions in a day, the second transaction
can only start after the first one is complete 
(Buy->sell->Buy->sell). The stock prices throughout the
day are represented in the form of an array of prices. 

Given an array price of size N, find out the maximum 
profit that a share trader could have made.

Example 1:

Input:
6
10 22 5 75 65 80
Output:
87
Explanation:
Trader earns 87 as sum of 12, 75 
Buy at 10, sell at 22, 
Buy at 5 and sell at 80
Example 2:

Input:
7
2 30 15 10 8 25 80
Output:
100
Explanation:

Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30,
Buy at 8 and sell at 80
Your Task:

Complete the function maxProfit() which takes an integer array
price as the only argument and returns an integer, 
representing the maximum profit, if only two transactions
are allowed.

Expected Time Complexity: O(N^3)

Expected Space Complexity: O(N)

Constraints:

1 <= N <= 105
1 <= price[i] <= 105


*************************************************************/



class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
        int profits[] = new int[n];
        
        int maxSell = price[n-1];
        int minBuy = price[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(price[i] > maxSell){
                maxSell = price[i];
            }
            maxProfit = Math.max(maxProfit,maxSell-price[i]);
            profits[i] = maxProfit;
        
            
        }
        
        for(int i=0;i<n;i++){
            if(price[i] < minBuy ){
                minBuy = price[i];
            }
            
            maxProfit = Math.max(maxProfit,profits[i] + price[i]-minBuy);
            profits[i] = maxProfit;
        }
        
        return profits[n-1];
        
    }
}
        
// Problem Link - https://practice.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1
