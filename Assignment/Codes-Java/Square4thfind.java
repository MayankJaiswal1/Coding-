// Find the 4th coordinate of square given 3 vertex using xor

public class Square4thfind {
   public static void main(String[] args) {
        Point p1 = new Point(20,10);
        Point p2 = new Point(10,20);
        Point p3 = new Point(10,10);
        int X = (p1.x ^ p2.x ^ p3.x ); // ^ = Xor
        int Y = (p1.y ^ p2.y ^ p3.y );
        System.out.println("fourth Cordinate : { " + X + "," + Y + "}");   
   } 

    static class  Point {
        int x , y;
        public Point(int x , int y){
            this.x = x;
            this.y = y;
        }        
    }
}
