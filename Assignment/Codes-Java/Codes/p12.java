
import java.util.*;

class InputDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter society name :  ");
		String socName = sc.next();
		//System.out.println("Enter flatno. : ");
		//int flatNo = Integer.parseInt(br.readLine());
		System.out.println("Enter wing name : ");
		char wing = sc.next().charAt(0);

		System.out.println("Enter flatno.");
		int flatNo = sc.nextInt();

		System.out.println("Enter your name " + name);
		System.out.println("Enter society name " + socName);
		System.out.println("Enter wing name " + wing);
		System.out.println("Enter flatno. " + flatNo);
	}
}
