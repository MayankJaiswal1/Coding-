/*Coin Change – Count Ways to Make Sum
 * Given an integer array of coins[] of size n representing different types of denominations and an integer sum, the task is to count all combinations of coins to make a given value sum.  

Note: Assume that you have an infinite supply of each type of coin. 

Examples: 

Input: sum = 4, coins[] = [1, 2, 3]
Output: 4
Explanation: There are four solutions: [1, 1, 1, 1], [1, 1, 2], [2, 2] and [1, 3]


Input: sum = 10, coins[] = [2, 5, 3, 6]
Output: 5
Explanation: There are five solutions: 
[2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5]


Input: sum = 10, coins[] = [10]
Output: 1
Explanation: The only is to pick 1 coin of value 10.


Input: sum = 5, coins[] = [4]
Output: 0
Explanation:  We cannot make sum 5 with the given coins
 */

package Array;

public class Coin_Change_Sum_Problem {
    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int sum = 5;
        System.out.println(count(coins, sum));
    }

    static int count(int coins[], int sum){
        return countRecur(coins, coins.length, sum);
    }

    static int countRecur(int coins[],int n, int sum){
         // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if(sum == 0) return 1;
        // 0 ways in the following two cases
        if(sum<0 || n==0) return 0;
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return countRecur(coins, n, sum-coins[n-1]) + countRecur(coins, n-1, sum);
    }
}
