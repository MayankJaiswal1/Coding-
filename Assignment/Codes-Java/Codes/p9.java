import java.util.*;

class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		//System.out.println(" Size of an array: "+arr.length);
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		int sum = 0;
		for(int i =0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		System.out.println("Sum: "+sum);
	}
}
