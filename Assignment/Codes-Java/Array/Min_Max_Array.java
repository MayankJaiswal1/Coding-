package Array;

public class Min_Max_Array {
    public static void main(String[] args) {
        int A[] = {4, 9, 6, 5, 2, 3};
        int N = A.length;
        System.out.println("Minimum element is : " + findMin(A, N));
        System.out.println("Maximum element is : " + findMax(A, N));
    }

    static int findMin(int A[], int N){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] < min){
                min = A[i];
            }
        }
        return min;
    }

    static int findMax(int A[], int N){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    
}
