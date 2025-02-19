class StringDemo{
	public static void main(String[] args){
		String str1 = "Core2Web";  //String literal (SCP)
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		String str2 = "Core2Web";  //String literal (SCP)
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		String str5 = "Coreweb";  //String literal (SCP)
                System.out.println(str5);
                System.out.println(System.identityHashCode(str5));

		String str3 = new String("Core2Web");   //Object type String or new String(Heap)
		System.out.println(str3);  
		System.out.println(System.identityHashCode(str3));

		String str4 = new String("Core2Web");  //Object type String or new String(Heap)
                System.out.println(str4);
		System.out.println(System.identityHashCode(str4));
	}
}
