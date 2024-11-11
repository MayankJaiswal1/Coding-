// Java program to find Majority
// element in an array using nested loops

package Array;

import java.util.HashMap;
import java.util.Map;

public class Majority_element_in_array {
    public static void main(String[] args) {
        int arr[] = {1,1,2,1,1,5,5,1,1,5};
        System.out.println(majorityElement(arr));

        int arr1[] = {1,1,2,3,1,5,1,7,8,1};
        System.out.println(majorityElement_II(arr1));
    }

    static int majorityElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }

    static int majorityElement_II(int arr[]){
        // Function to find Majority element in an array
        // It returns -1 if there is no majority element
        int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        // Traverse the array and count occurrences using the hash map
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // Check if current element count exceeds n / 2
            if(countMap.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}
