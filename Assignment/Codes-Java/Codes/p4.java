
class JVMInternal{
	public static void main(String[] args){
		char ch1 = 'A';  //65
		char ch2 = 'a';  //97  
		char ch3 = 'B';  //66
		int x = 65;
		int y = 97;
		int z = 66;
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(ch3));
		System.out.println(System.identityHashCode(z));
	}
}
