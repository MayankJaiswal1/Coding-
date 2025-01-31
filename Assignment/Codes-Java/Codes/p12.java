class StringDemo{
	public static void main(String[] args){
		String str1 = "Shashi";   //String Constant Pool(SCP)
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		String str2 = new String("Shashi");  //SCP
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
	}
}
/*

mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/8 - Strings in Java/Strings 27_13-March$ vim p13.jav
a
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/8 - Strings in Java/Strings 27_13-March$ vim p12.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/8 - Strings in Java/Strings 27_13-March$ javac p12.java
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/8 - Strings in Java/Strings 27_13-March$ java StringDemo
Shashi
789451787
Shashi
1950409828
mac@LAPTOP-C6S5TUPQ:~/java/Dailycodes/8 - Strings in Java/Strings 27_13-March$ javap -c StringDemo.class
Compiled from "p12.java"
class StringDemo {
  StringDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String Shashi
       2: astore_1
       3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: aload_1
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      10: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
      13: aload_1
      14: invokestatic  #5                  // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      17: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
      20: new           #7                  // class java/lang/String
      23: dup
      24: ldc           #2                  // String Shashi
      26: invokespecial #8                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
      29: astore_2
      30: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
      33: aload_2
      34: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      37: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
      40: aload_2
      41: invokestatic  #5                  // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      44: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
      47: return
}



   */
