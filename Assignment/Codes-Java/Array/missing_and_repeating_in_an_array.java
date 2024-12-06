package Array;

import java.util.Arrays;

public class missing_and_repeating_in_an_array {
    public static void main(String[] args) {
        int arr[] = {7,3,4,5,5,6,2};
        printTwoElements(arr);
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
}
