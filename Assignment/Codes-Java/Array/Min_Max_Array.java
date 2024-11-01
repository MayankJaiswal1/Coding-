// package Array;

// public class Min_Max_Array {
//     public static void main(String[] args) {
//         int A[] = {4, 9, 6, 5, 2, 3};
//         int N = A.length;
//         System.out.println("Minimum element is : " + findMin(A, N));
//         System.out.println("Maximum element is : " + findMax(A, N));
//     }

//     static int findMin(int A[], int N){
//         int min = Integer.MAX_VALUE;
//         for(int i=0; i<N; i++){
//             if(A[i] < min){
//                 min = A[i];
//             }
//         }
//         return min;
//     }

//     static int findMax(int A[], int N){
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<N; i++){
//             if(A[i] > max){
//                 max = A[i];
//             }
//         }
//         return max;
//     }
    
// }






package Array;

import java.util.Arrays;

/**
 *  Pair
 */ 
 
class Pair {
    public int min;
    public int max;
}

class Min_Max_Array {
    public static void main(String[] args) {
        int A[] = {4, 9, 6, 5, 2, 3};
        int N = A.length;
        Pair minmax = getMinMax(A, N);
        System.out.println("Minimum element is : " + minmax.min);
        System.out.println("Maximum element is : " + minmax.max);
    }

    static Pair getMinMax(int A[], int N){
        Pair minmax = new Pair();
        Arrays.sort(A);
        minmax.min = A[0];
        minmax.max = A[N-1];
        return minmax;
    }
    
}