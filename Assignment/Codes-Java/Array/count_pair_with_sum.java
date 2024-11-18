/*
 * Input: arr[] = {1, 5, 7, -1, 5}, target = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).         


Input: arr[] = {1, 1, 1, 1}, target = 2
Output:  6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1) and (1, 1).


Input: arr[] = {10, 12, 10, 15, -1}, target = 125
Output:  0
 */

package Array;

import java.util.HashMap;
import java.util.Map;

public class count_pair_with_sum {
    public static void main(String[] args) {
        int arr[] = {1,5,7,-1,5};
        int target = 6;
        System.out.println(countPairs(arr, target));
        System.out.println(countPairs_II(arr, target));
    }

    static int countPairs(int arr[], int target){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    static int countPairs_II(int arr[], int target){
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(freq.containsKey((target - arr[i]))){
                count += freq.get(target - arr[i]);
            }
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
