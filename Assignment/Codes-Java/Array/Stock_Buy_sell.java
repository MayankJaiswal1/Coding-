/*
 * Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
                       Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
                       Maximum Profit  = 210 + 655 = 865


Maximize-Profit--Graph



Input: prices[] = {4, 2, 2, 2, 4}
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2
                       Maximum Profit  = 2


 */

package Array;

public class Stock_Buy_sell {
    public static void main(String[] args) {
        int prices[] = {100, 180, 260, 310, 400, 535, 695, 555};
        System.out.println(maximumProfit(prices));
    }

    static int maximumProfit(int prices[]){
        return maxProfitRec(prices, 0, prices.length - 1);
    }

    static int maxProfitRec(int price[], int start, int end){
        int res = 0;
        for(int i=start; i<end; i++){
            for(int j=i+1; j<=end; j++){
                if(price[j] > price[i]){
                    int curr = (price[j] - price[i]) + maxProfitRec(price, start, i-1) + maxProfitRec(price, j+1, end);
                    res = Math.max(res, curr);
                }
            }
        }
        return res;
    }
    
}
