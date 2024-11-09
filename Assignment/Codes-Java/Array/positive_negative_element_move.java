package Array;

import java.util.Arrays;

public class positive_negative_element_move {
    // Java program to move all negative numbers to the
    // beginning and all positive numbers to the end with
    // constant extra space

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        move(arr);
        for(int e : arr){
            System.out.print(e + " ");
        }

        int arr1[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr1.length;
        rearrange(arr1, n);
        printArray(arr1, n);
    }

    static void move(int arr[]){
        Arrays.sort(arr);
    }

    static void rearrange(int arr[], int n){
        int j = 0, temp;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
