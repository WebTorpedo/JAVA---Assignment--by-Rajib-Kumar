/* The process of finding the largest value (i.e., the maximum of a group of
values) is used frequently in computer applications. For example, a program
that determines the winner of a sales contest would input the number of units
sold by each sales person. The sales person who sells the most units wins the
contest. Write a Java application that inputs a series of 10 integers and
determines and prints the largest integer. Your program should use at least the
following three variables:
  a. counter: A counter to count to 10 (i.e., to keep track of how
    many numbers have been input and to determine when all 10
    numbers have been processed).
  b. number: The integer most recently input by the user.
  c. largest: The largest number found so far. */

import java.util.Scanner; 
 class LargestValue
{
 Scanner input = new Scanner(System.in);

int intCounter = 0;
int total = 0;
int number;
int largest;

public void determineLargestValue()
{
  System.out.println("Enter largest input number: ");
   largest = input.nextInt();
   total += largest;

while (intCounter < 9)
{
System.out.println("Enter number: ");
number = input.nextInt();
if(number > largest)
{
largest = number;
}
total += number;
intCounter++;
}
System.out.printf("The total is : %d\n", total);
System.out.printf("\nThe largest of all 10 integers is: %d\n", largest, number);
}
}
public class LargestValueTest
{
public static void main(String args[])
{
LargestValue LargestValue1 = new LargestValue();//create object of LargestValue class to call method
LargestValue1.determineLargestValue();//find the largest integer in 10
}
}