// Find the Fibonacci numbers are defined as F0=1,F1=1 and Fi=Fi-1+Fi-2 for i>2.

package Rajib;
import java.util.Scanner;
public class Fibonacci{
    static int fibRecursion(int arr[],int n){
        if(n<=1) return n;
        return fibRecursion(arr, n-1)+fibRecursion(arr, n-2);
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("How many number that you want to test?: ");

        int Number=sc.nextInt();
        int arr[]=new int[Number];
        arr[0]=0;arr[1]=1;
        for(int i=2;i<Number;i++){
            arr[i]=fibRecursion(arr, i);
        }
        for (int x: arr) {
            System.out.printf("%d ",arr[x]);
        }
    }
}
