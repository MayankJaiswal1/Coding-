/*
 * Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements


Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.
 */

package Array;

import java.util.HashSet;

public class longest_consecutive_subsequence {
    public static void main(String[] args) {
        int arr[] = {1,9,3,10,4,20,2,15,8,7};
        int n = arr.length;
        System.out.println("Length of the longest consecutive subsequence is " + findLongestConseqSubseq(arr, n));
    }

    static int findLongestConseqSubseq(int arr[], int n){
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
        for(int i=0; i<n; i++){
            S.add(arr[i]);
        }
        for(int i=0; i<n; i++){
            if(!S.contains(arr[i] - 1)){
                int j = arr[i];
                while(S.contains(j)){
                    j++;
                }
                if(ans < j - arr[i]){
                    ans = j - arr[i];
                }
            }
        }
        return ans;
    }
}
