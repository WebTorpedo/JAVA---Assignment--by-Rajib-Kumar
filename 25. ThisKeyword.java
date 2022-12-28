/*Write a program to give the example for ‘this’ operator. And also use the ‘this’
keyword as return statement */

import java.util.Scanner;
     class Identity {
        public String name;
        public int age;

        public Identity SetValues() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the Person: ");
            String name = sc.nextLine();
            System.out.println("Enter the age of the Person: ");
            int age = sc.nextInt();
            this.name = name;
            this.age = age;
            return this;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age +" yrs old");
        }
    }
        public class ThisKeyword {
        public static void main(String args[]) {
            Identity obj = new Identity();
            obj = obj.SetValues();
            obj.display();
        }
    }
