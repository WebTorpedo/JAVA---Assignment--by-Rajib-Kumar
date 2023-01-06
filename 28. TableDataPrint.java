// Write a Java application that uses looping to print the following table of values

public class TableDataPrint {
    public static void main(String[] args) {
        int x=1;
        System.out.println("N \t 10*N \t 100*N \t 1000*N\n");
        for(int i=1;i<=5;i++){
            System.out.println(+x+" \t "+x*10+" \t "+x*100+" \t "+x*1000);
            x++;
        }
    }
}