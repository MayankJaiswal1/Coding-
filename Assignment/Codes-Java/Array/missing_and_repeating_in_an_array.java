/*
 * Given an unsorted array of size n. Array elements are in the range of 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Examples: 

Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 2 is missing and 3 occurs twice 


Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1


 */

package Array;

import java.util.Arrays;

public class missing_and_repeating_in_an_array {
    public static void main(String[] args) {
        int arr[] = {7,3,4,5,5,6,2};
        printTwoElements(arr);
        printTwoElements_II(arr);
        repeatedNumber(arr);
    }

    static void printTwoElements(int[] arr){
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];
        int repeating = -1, missing = -1;
        Arrays.fill(visited, false);
        for(int i=0; i<n; i++){
            if(visited[arr[i]]){
                repeating  = arr[i];
            }else{
                visited[arr[i]] = true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                missing = i;
                break;
            }
        }
        System.out.println("Repeating : " + repeating);
        System.out.println("Missing : " + missing);
    }

    static void printTwoElements_II(int[] arr){
        int n = arr.length;
        int missing = (n*(n+1)) / 2;
        System.out.print("Repeating : ");
        for(int i=0; i<n; i++){
            int absVal = Math.abs(arr[i]);
            if(arr[absVal - 1] > 0){
                arr[absVal - 1] = -arr[absVal - 1];
                missing -= absVal;
            }else{
                System.out.println(absVal);
            }
        }
        System.out.println("Missing : " + missing);
    }

    static void repeatedNumber(int[] arr){
        int n = arr.length;
        long s = (long) (n*(n+1)) / 2;
        long ssq = (long) (n*(n+1)*(2*n+1));
        long missing = 0, repeating = 0;
        for(int i = 0; i<n; i++){
            s -= arr[i];
            ssq -= (long) arr[i] * arr[i];
        }
        missing = (s + ssq/s)/2;
        repeating = missing - s;
        System.out.println("Repeating : " + repeating);
        System.out.println("Missing : " + missing);
    }
}
