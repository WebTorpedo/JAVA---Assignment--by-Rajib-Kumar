/* Create a super class called Car. The Car class has the following fields and
methods. ◦intspeed; ◦doubleregularPrice; ◦Stringcolor; ◦doublegetSalePrice().
Create a sub class of Car class and name it as Truck. The Truck class has the
following fields and methods. ◦intweight; ◦doublegetSalePrice();
Create a sub class of Car class and name it as Truck. The Truck class has the
following fields and methods. ◦intweight; ◦doublegetSalePrice();
Create a subclass of Car class and name it as Sedan. The Sedan class has the
following fields and methods. ◦intlength; ◦doublegetSalePrice();
Create MyOwnAutoShop class which contains the main() method. Perform
the following within the main() method. ◦Create an instance of Sedan class
and initialize all the fields with appropriate values. Use super(...) method in
the constructor for initializing the fields of the superclass. ◦Create two
instances of the Ford class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the super
class.
Create an instance of Car class and initialize all the fields with appropriate
values. Display the sale prices of all instance */

class Car {
     int speed;
     double regularPrice;
     String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
 class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (weight > 2000 ? 0.85 : 0.75);
    }
}
 class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
    }
}
/*class Frod extends Car {
     int year;
    public int manufacturerDiscount;

    public Frod(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() ;
    }
}
*/
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck t1 = new Truck(500, 500, "red", 30);
        Sedan s1 = new Sedan(500, 500, "black", 30);
        Sedan s2 = new Sedan(500, 500, "red", 30);
        //Frod f1 = new Frod(250, 250, "yellow", 2020, 40);
        Car car = new Car(100, 100, "white");
        System.out.println("t1 "+t1.getSalePrice());
        System.out.println("s1 "+s1.getSalePrice());
        System.out.println("s2 "+s2.getSalePrice());
       // System.out.println("f2 "+f1.getSalePrice());
        System.out.println("car "+car.getSalePrice());
    }
}