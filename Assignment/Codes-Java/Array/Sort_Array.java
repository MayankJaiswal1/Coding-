package Array;

import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void sortArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            break;
        }
    }
}
