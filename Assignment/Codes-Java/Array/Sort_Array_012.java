package Array;

public class Sort_Array_012 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2};
        int n = arr.length;

        // Java Program to sort an array of 0s, 1s and 2s
        // by counting the occurrence of 0s, 1s and 2s
        sort012(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println( );
        // Java program to sort an array of 0s, 1s and 2s 
        // using Dutch National Flag Algorithm
        sort012_II(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }


    // Function to sort the array of 0s, 1s and 2s
    static void sort012(int arr[]){
        int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s and 2s
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                c0++;
            }else if(arr[i] == 1){
                c1++;
            }else if(arr[i] == 2){
                c2++;
            }
        }
        int index = 0;

        // Place all the 0s
        for(int i=0; i<c0; i++){
            arr[index++] = 0;
        }

        // Place all the 1s
        for(int i=0; i<c1; i++){
            arr[index++] = 1;
        }

        // Place all the 2s
        for(int i=0; i<c2; i++){
            arr[index++] = 2;
        }
    }


    // Function to sort an array of 0s, 1s and 2s
    static void sort012_II(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        int temp = 0;

        // Iterate till all the elements are sorted
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            } 
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
