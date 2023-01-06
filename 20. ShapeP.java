/*Write a program to create a class named shape. In this class we have three sub
classes circle, triangle and square each class has two member function named
draw () and erase (). Create these using polymorphism concepts*/

class Shape{
    void draw()
    {
        System.out.println("Shape draw()");
    }
    void erase()
    {
        System.out.println ("Shape erase()");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle...");
    }
    void erase(){
        System.out.println("Erasing Circle..");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square...");
    }
    void erase(){
        System.out.println("Erasing Square..");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle...");
    }
    void erase(){
        System.out.println("Erasing Triangle..");
    }
}
public class ShapeP {
    public static void main(String[] args) {
        Shape c1=new Circle();Shape s1=new Square();
        Shape t1=new Triangle();
        c1.draw();c1.erase();
        s1.draw();s1.erase();
        t1.draw();t1.erase();
    }
}

