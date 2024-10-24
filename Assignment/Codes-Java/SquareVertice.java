public class SquareVertice {
    public static void main(String[] args) {
        int x1 = 1 , y1 = 2;
        int x2 = 3 , y2 = 4;
        findvertices(x1, y1, x2, y2);
    }

    static void findvertices(int x1, int y1, int x2, int y2){
        if(x1 == x2){
            System.out.println((x1 + y2 - y1) + y1);
            System.out.println((x2 + y2 - y1) + y2);
        }
        else if(y1 == y2){
            System.out.println(x1 + (y1 + x2 - x1));
            System.out.println(x2 + (y2 + x2 - x1));
        }
        else if(Math.abs(x2 - x1) == Math.abs(y2 - y1)){
            System.out.println(x1 + "," + y2);
            System.out.println(x2 + "," + y1);
        }
        else{
            System.out.println("-1");
        }
        
    }
}
