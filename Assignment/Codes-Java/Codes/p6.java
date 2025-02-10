
class Demo{
	public static void main(String[] args){
		int x = 9;
		char ch1 = '9';
		int  y = 57;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(y));
	}
}


/*
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ vim p6.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ javac p6.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ java Demo
1083489569
789451787
428953523
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ javap -c
Error: no classes specified
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/Arrays/Interger_Cache 26_12-March$ javap -c Demo.class
Compiled from "p6.java"
class Demo {
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        9
       2: istore_1
       3: bipush        57
       5: istore_2
       6: bipush        57
       8: istore_3
       9: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      12: iload_1
      13: invokestatic  #3                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      16: invokestatic  #4                  // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      19: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
      22: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      25: iload_2
      26: invokestatic  #6                  // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      29: invokestatic  #4                  // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      32: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
      35: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      38: iload_3
      39: invokestatic  #3                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      42: invokestatic  #4                  // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      45: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
      48: return
}


*/
