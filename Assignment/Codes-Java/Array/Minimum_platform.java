/*
 * Minimum Platforms Required for Given Arrival and Departure Times
 * 
 * We are given two arrays that represent the arrival and departure times of trains, the task is to find the minimum number of platforms required so that no train waits.
 * 
 * Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
Output: 3 
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)


Input: arr[] = {9:00, 9:40}, dep[] = {9:10, 12:00} 
Output: 1 
Explanation: Only one platform is needed. 

 */


package Array;

public class Minimum_platform {
    public static void main(String[] args) {
        int arr[] = {100, 300, 500};
        int dept[] = {900, 400, 600};
        int n = 3;
        System.out.println(findPlatform(arr, dept, n));
    }

    static int findPlatform(int arr[], int dept[], int n){
        int plat_needed = 1, result = 1;
        for(int i=0; i<n; i++){
            plat_needed = 1;
            for(int j=0; j<n; j++){
                if(i != j){
                    if(arr[i] >= arr[j] && dept[j] >= arr[i]){
                        plat_needed++;
                    }
                }
            }
            result = Math.max(result, plat_needed);
        }
        return result;
    }
}

