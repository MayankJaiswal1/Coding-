/*Trapping Rainwater Problem states that given an array of n non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain.

Trapping Rainwater Problem
Trapping Rainwater Problem

Examples:
Let us understand Trapping Rainwater problem with the help of some examples:  

Input: arr[] = {3, 0, 1, 0, 4, 0, 2}
Output: 10
Explanation: The expected rainwater to be trapped is shown in the above image.


Input: arr[]   = {3, 0, 2, 0, 4}
Output: 7
Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.


Input: arr[] = {1, 2, 3, 4}
Output: 0
Explanation : We cannot trap water as there is no height bound on both sides


Input: arr[] = {2, 1, 5, 3, 1, 0, 4}
Output: 9
Explanation : We trap 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units of water. 
 */

package Array;

public class Trapping_Rain_Water_Problem {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,1,0,4,2,4};
        System.out.println(maxWater(arr));
    }

    static int maxWater(int arr[]){
        int res = 0;
        for(int i=1; i<arr.length; i++){
            int left = arr[i];
            for(int j=0; j<i; j++){
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for(int j=i+1; j<arr.length; j++){
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
}
