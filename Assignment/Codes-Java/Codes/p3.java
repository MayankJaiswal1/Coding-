import java.util.*;

class OneInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for rows and columns : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
		System.out.println("Enter array Elements: " );
		for(int i=0; i<arr.length; i++){
			for( int j=0; j<arr.length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(" Array Elements are: ");
		for(int i=0; i<arr.length; i++){
                        for( int j=0; j<arr.length; j++){
                                System.out.print(arr[i][j] + " ");
                        }
			System.out.println();
                } 
	}
}
