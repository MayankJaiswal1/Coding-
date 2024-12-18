package T0P_50_PrepInsta;

public class Even_ODD_no {
    public static void main(String[] args) {
        int num = 29;
        if(num % 2 == 0){
            System.out.println(num+ "is even");
        }else{
            System.out.println(num + " is odd");
        }

        String status = num % 2 == 0 ? "is Even" : " is Odd";
        System.out.println(num + status);
    }
}
