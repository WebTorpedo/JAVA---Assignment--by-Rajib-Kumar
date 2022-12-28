// Write a program to give the example for ‘super’ keyword

class Varsity {
        public void display(){
            System.out.println("\nNoakhali Science and Technology University");
        }
    }

    class IIT extends Varsity {
        @Override
        public void display(){
            System.out.println("\nInstitute of Information Technology, NSTU");
        }

        public void printMessage(){
            display();
            super.display();
        }
    }

public class SuperKeyword {
        public static void main(String[] args) {
            IIT vs = new IIT();
            vs.printMessage();
        }
}