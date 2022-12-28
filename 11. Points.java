/* Create class point with following instance variable and methods. Instance
variable: private int x,y
a) Constructors : public Point(), Point(int x, int y)
b) Methods : public void setX(int x), setY(int y), setXY(int x, int y) */

class Point {
    private int x = 0;
    private int y = 0;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void display() {
        System.out.println("X point is: " +x+ "  And Y point is: "+y);
    }
    public double distance (Point p2)
    {
        return(Math.sqrt( (x-p2.x) * (x-p2.x) + (y-p2.y) * (y-p2.y) ));
    }
}
public class Points {
    public static void main(String[] args) {
        double a, b, c;
        Point Np,Np1,Np2;
        Np = new Point(5, 6);
        Np1 = new Point();
        Np2 = new Point();
        Np1.setX(3);
        Np1.setY(6);
        Np1.getX();
        Np1.getY();
        Np2.setXY(8,9);
        a = Np1.distance(Np2);
        b = Np2.distance(Np);
        c = Np.distance(Np1);
        System.out.println("Distance between point Np1 to Np2 is: " +a);
        System.out.println("Distance between point Np2 to Np is: " +b);
        System.out.println("Distance between point Np to Np1 is: " +c);
        System.out.println(" Points Of Np: ");
        Np.display();
        System.out.println(" Points Of Np1: ");
        Np1.display();
        System.out.println(" Points Of Np2: ");
        Np2.display();
    }
}

