class StringDemo{
	public static void main(String[] args){
		String str1 = "Shashi";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		String str2 = "Shashi Bagal"; 
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		String str3 = new String("Shashi");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		String str4 = new String("Shashi");   
		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));
	}
}
