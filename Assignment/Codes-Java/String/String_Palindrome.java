package String;

public class String_Palindrome {
    public static void main(String[] args) {
        String str = "arora";
        char ch;
        String revstr = "";
        for(int i=str.length()-1; i>=0; i--){
            ch = str.charAt(i);
            revstr += ch;
        }
        System.out.println(revstr);
        if(str.equals(revstr)){
            System.out.println("Paimdrome");
        }else{
            System.out.println("not a Palimdrome");
        }
    }
}

