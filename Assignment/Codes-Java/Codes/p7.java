class ThreeDArray{
	public static void main(String[] args){
		float arr[][][] = new float[2][3][3];
		System.out.println(arr[1][1][1]); //0
		System.out.println(arr[1][1]);    //[F@
		System.out.println(arr[1]);       //[[F@
		System.out.println(arr);          //[[[F@
	}
}
