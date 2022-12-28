/* Write a program to find the factorial problems using
Recursion */

import java.util.*;
public class Recursion_Factorial {
        public static long multiplyNumbers(int num)
        {
            if (num >= 1)
                return num * multiplyNumbers(num - 1);
            else
                return 1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num ;
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            long factorial = multiplyNumbers(num);
            System.out.println("Factorial of " + num + " = " + factorial);
        }
    }