// Write a program to give a simple example for abstract class.

abstract class Varsity{
        abstract void name();
    }
    class NSTU extends Varsity {
        void name() {
            System.out.println("\nNoakhali Science and Technology University");
        }
    }
public class AbstractClass {
        public static void main(String args[]){
            Varsity obj = new NSTU();
            obj.name();
        }
    }

