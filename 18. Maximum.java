/* Find the maximum of an array. Let a[] be an array of integers. if n= 1, a[0] is
the only number in the array and so, maximum = a[0]. if n > 1 , then do the
following: find the maximum of n-1 entries of the array. Compare this
maximum with the last entry a[n-1] and finalize. */

import java.util.Scanner;

public class Maximum {
    static int findMax(int arr[],int n){
    if(n==1) return arr[0];
    return Math.max(arr[n-1], findMax(arr, n-1));
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x;
    System.out.println("How many elements that you want to test: ");
    x=sc.nextInt();
    int arr[]=new int[x];
    for(int i=0;i<x;i++) arr[i]=sc.nextInt();
    System.out.println("Maximum element is: "+findMax(arr,x));
}
}