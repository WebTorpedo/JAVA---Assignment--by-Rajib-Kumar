/* Write a Java application that allows the user to enter up to 20 integer grades
into an array. Stop the loop by typing in ‐1. Your main method should call an
Average method that returns the average of the grades. Use the
DecimalFormat class to format the average to 2 decimal places. */

import java.util.Scanner;
public class AverageCal {
        public static double Average(int grades[], int max ) {
            int sum=0;
            double average=0.0;

            for (int i=1;i<max;i++){
                sum+=grades[i];
                average=sum/(i);
            }
            return average;
        }

            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);

                int i, grades[];
                grades=new int[20];

                    System.out.printf("Enter Grade value: ");
                for (i=0;i<20;i++){
                    grades[i]=input.nextInt();
                    if (grades[i]==-1) break;
                }
                System.out.printf("The average value is: %.2f", Average(grades, i-1));
        }
}

