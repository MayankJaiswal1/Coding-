
import java.io.*;

class InputDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter society name");
		String socName = br.readLine();
		System.out.println("Enter wing name");
		char wing = (char)br.read();
		System.out.println("Enter flatno.");
		int flatNo = br.readLine();

		System.out.println("Enter your name" + name);
		System.out.println("Enter society name" + socName);
		System.out.println("Enter wing name" + wing);
		System.out.println("Enter flatno." + flatNo);
	}
}
