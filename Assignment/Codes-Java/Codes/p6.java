class ThreeDArray{
	public static void main(String[] args){
		int arr[][][] = new int[2][3][3];
		System.out.println(arr[1][1][1]); //0
		System.out.println(arr[1][1]);    //[I@
		System.out.println(arr[1]);       //[[I@
		System.out.println(arr);         //[[[I@
	}
}
