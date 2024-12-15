/*
 * Jump Game – Minimum Jumps to Reach End
Last Updated : 25 Nov, 2024
Given an array arr[] of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x. Find the minimum number of jumps to reach the end of the array starting from the first element. If an element is 0, then we cannot move through that element.

Note:  Return -1 if we can’t reach the end of the array.

Examples: 

Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3 (1-> 3 -> 9 -> 9)
Explanation: Jump from 1st element to 2nd element as there is only 1 step.
Now there are three options 5, 8 or 9. If 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.


Input:  arr[] = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
Output: 10
Explanation: In every step a jump is needed so the count of jumps is 10.
 */

package Array;

public class Jump_Game {
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minJumps(arr));
    }

    static int minJumps(int arr[]){
        int ans  = minJumpsRecur(0, arr);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }

    static int minJumpsRecur(int i, int arr[]){
        if(i >= arr.length-1){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int j=i+1; j<=i + arr[i]; j++){
            int val = minJumpsRecur(j, arr);
            if(val != Integer.MAX_VALUE){
                ans = Math.min(ans, 1+val);
            }
        }
        return ans;
    }
}
