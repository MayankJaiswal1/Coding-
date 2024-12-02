/*
 * Given a matrix mat[][] of size m x n, the task is to print all elements of the matrix in spiral form.

Examples: 

Input: mat[][] = [[1,    2,   3,   4],
                             [5,    6,   7,   8],
                             [9,   10,  11,  12],
                             [13,  14,  15,  16]]
Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Explanation: The output is matrix in spiral format. 
Example-of-matrix-in-spiral-form
Example of matrix in spiral form

Input: mat[][]= [[1,   2,   3,   4,  5,   6],
                            [7,   8,   9,  10,  11,  12],
                            [13,  14,  15, 16,  17,  18]]


Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
Explanation: The output is matrix in spiral format.
 */

package Array;

public class print_given_matrix_in_spiral_form {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralPrint(mat.length, mat[0].length,mat);
    }

    static void spiralPrint(int m, int n, int mat[][]){
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; ++i){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for(int i=top; i<=bottom; ++i){
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; --i){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top; --i){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}
