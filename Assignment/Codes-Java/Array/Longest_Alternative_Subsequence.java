/*
 * A sequence {X1, X2, .. Xn} is an alternating sequence if its elements satisfy one of the following relations : 


  X1 < X2 > X3 < X4 > X5 < …. xn or 
  X1 > X2 < X3 > X4 < X5 > …. xn


Examples:


Input: arr[] = {1, 5, 4}
Output: 3
Explanation: The whole arrays is of the form  x1 < x2 > x3 


Input: arr[] = {10, 22, 9, 33, 49, 50, 31, 60}
Output: 6
Explanation: The subsequences {10, 22, 9, 33, 31, 60} or
{10, 22, 9, 49, 31, 60} or {10, 22, 9, 50, 31, 60}
are longest subsequence of length 6
 */

package Array;

public class Longest_Alternative_Subsequence {
    /* Driver code*/
    public static void main(String[] args) {
        int arr[] = {10,22,9,33,49,50,31,60};
        int n = arr.length;
        System.out.println("Length of Longest alternating subsequence is " + zzis(arr, n));
        System.out.println(LAST(arr,n));
    }

    // Function to return longest
    // alternating subsequence length
    static int zzis(int arr[], int n){
        /*las[i][0] = Length of the longest
            alternating subsequence ending at
            index i and last element is
            greater than its previous element
        las[i][1] = Length of the longest
            alternating subsequence ending at
            index i and last element is
            smaller than its previous
            element */
        int last[][] = new int[n][2];
        for(int i=0; i<n; i++){
            last[i][0] = last[i][1] = 1;
        }
        int res = 1;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                // If arr[i] is greater, then
                // check with las[j][1]
                if(arr[j] < arr[i] && last[i][0] < last[j][1] + 1){
                    last[i][0] = last[j][1] + 1;
                }
                // If arr[i] is smaller, then
                // check with las[j][0]
                if(arr[j] > arr[i] && last[i][1] < last[j][0] + 1){
                    last[i][1] = last[j][0] + 1;
                }
            }
            /* Pick maximum of both values at
            index i */
            if(res < Math.max(last[i][0], last[i][1])){
                res = Math.max(last[i][0], last[i][1]);
            }
        }
        return res;
    }

    // Function for finding
    // longest alternating
    // subsequence
    static int LAST(int arr[], int n){
        // "inc" and "dec" initialized as 1,
        // as single element is still LAS
        int inc = 1; int dec = 1;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                 // "inc" changes if "dec"
                // changes
                inc = dec + 1;
            }
            else if(arr[i] < arr[i - 1]){
                // "dec" changes if "inc"
                // changes
                dec = inc + 1;
            }
        }
        // Return the maximum length
        return Math.max(inc, dec);
    }
        
}

