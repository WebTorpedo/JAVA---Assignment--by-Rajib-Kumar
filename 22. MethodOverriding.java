// Write a program to give the example for method overriding concepts.

class Varsity1 {
        public void displayInfo() {
            System.out.println("\nNoakhali Science and Technology University");
        }
    }

    class IIT extends Varsity1 {
        @Override
        public void displayInfo() {
            System.out.println("\nInstitute of Information Technology, NSTU");
        }
    }
public class MethodOverriding {
        public static void main(String[] args) {
            IIT d1 = new IIT();
            d1.displayInfo();
        }
}