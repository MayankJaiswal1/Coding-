class JVMInternal{
	public static void main(String[] args){
		char ch1 = 'A';  //65
		char ch2 = 'a';  //97  
		char ch3 = 'B';  //66
		int x = 65;
		//int y = 97;
		//int z = 66;
		/*System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(ch3));
		System.out.println(System.identityHashCode(z));*/
	}
}
/*
Byte code of the program: 
   
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ vim p5.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ javac p5.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ javap -c JVMInternal.class
Compiled from "p5.java"
class JVMInternal {
  JVMInternal();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        65
       2: istore_1
       3: bipush        97
       5: istore_2
       6: bipush        66
       8: istore_3
       9: bipush        65
      11: istore        4
      13: return
}
*/
