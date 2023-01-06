/*Write a program for the following
b. Example for call by reference.
*/
class Modify1{
    int data = 10;
    void change(Modify1 M){
        data+=50;
    }
}
public class CallByReference {
    public static void main(String[] args) {
        Modify1 M = new Modify1();
        System.out.println("\nBefore Change: "+ M.data);
        M.change(M);
        System.out.println("\nAfter Change: "+ M.data);

    }
}
