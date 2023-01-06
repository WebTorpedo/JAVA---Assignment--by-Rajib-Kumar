/*Write a program for the following
a. Example for call by value.*/

class Modify{
    int data = 10;
    void change(int data){
        data+=50;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Modify M = new Modify();
        System.out.println("Before Change: "+ M.data);
        M.change(20);
        System.out.println("After Change: "+ M.data);

    }
}
