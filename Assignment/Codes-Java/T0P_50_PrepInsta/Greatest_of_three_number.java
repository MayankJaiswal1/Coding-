package T0P_50_PrepInsta;

public class Greatest_of_three_number {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        if(n1 >= n2 && n1 >= n3){
            System.out.println(n1 + " is the greatest");
        }
        else if(n2 >= n1 && n2 >= n3){
            System.out.println(n2 + " is the greatest");
        }
        if(n3 >= n2 && n3 >= n2){
            System.out.println(n3 + " is the greatest");
        }
    }
}
