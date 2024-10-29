package String;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello";
        char ch;
        String revstr = "";
        for(int i=str.length()-1; i>=0; i--){
            ch = str.charAt(i);
            revstr += ch;
        }
        System.out.println(revstr);
    }
}
