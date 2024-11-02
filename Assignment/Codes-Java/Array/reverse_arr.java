// package Array;

// public class reverse_arr {
//     public static void main(String[] args) {
//         int arr[] = {1, 4, 3, 2, 6, 5};
//         revA(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i] + " ");
//         }
//     }

//     static void revA(int arr[]){
//         int n = arr.length;
//         int temp[] = new int[n];
//         for(int i=0; i<n; i++ ){
//             temp[i] = arr[n-i-1];
//         }
//         for(int i=0; i<n; i++ ){
//             arr[i] = temp[i];
//         }
//     }
    
// }







package Array;

public class reverse_arr {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        revA(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    static void revA(int arr[]){
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    
}
