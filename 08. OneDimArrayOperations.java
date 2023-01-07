/* Write statements that perform the following one‐dimensional‐array
operations:
a) Set the 10 elements of integer array counts to zero.
b) Add one to each of the 15 elements of integer array bonus.
c) c).Display the five values of integer array bestScores in column format  */

public class OneDimArrayOperations {
    public static void main(String [] args){
        
        // a) Set the 10 elements of integer array counts to zero.
        int array[]={0,0,0,0,0,0,0,0,0,0};

        // b) Add one to each of the 15 elements of integer array bonus.

        int [] arrayBonus = new int[15];
        for (int i = 0; i <arrayBonus.length; i++) {
            arrayBonus[i]+=1;
        }

        //c) Display the five values of integer array bestScores in column format.
        int [] bestScores = {50,40,30,20,10};
        System.out.printf("%n%s%12s %n", "Value", "BestScores");
        for (int counter = 0; counter < bestScores.length ; counter++) {

            System.out.printf( "%d%9d%n" , counter , bestScores[counter]);
        }
    }
}
