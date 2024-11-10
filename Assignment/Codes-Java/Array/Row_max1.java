// Find the row with maximum number of 1s


package Array;

public class Row_max1 {
    static int R = 4;
    static int c = 4;

    static int rowWithMax1s(int mat[][], int R, int C){
        // Flag to check if there is not even a single 1 in the matrix.
        boolean flag = true;
        int max_row_index = 0, max_ones =0;
        for(int i=0; i<R; i++){
            int count1 =0;
            for(int j=0; j<C; j++){
                if(mat[i][j] == 1){
                    count1++;
                    flag = false;
                }
            }
            if(count1 > max_ones){
                max_ones = count1;
                max_row_index = i;
            }
        }
        // Edge case where there are no 1 in the matrix
        if(flag){
            return -1;
        }
        return max_row_index;
    }

    public static void main(String[] args) {
        int mat[][] = { {0,0,0,1},
                        {0,0,0,0},
                        {1,1,1,1},
                        {1,1,1,1}};
        System.out.println("Index of row with matrix 1s is " + rowWithMax1s(mat, R, c));                
    }
    
}
