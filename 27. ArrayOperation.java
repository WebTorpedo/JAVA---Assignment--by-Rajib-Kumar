/*Write a program to calculate the following
a) Find the length of array.
b) Demonstrate a one-dimensional array.
c) Demonstrate a two-dimensional array.
d) Demonstrate a multi-dimensional array.
*/
public class ArrayOperation {
    /*
    a) Find the length of array
    b) Demonstrate a one-dimensional array. */

    static void OneDimensional(){
        int arr[]={1,2,3,4,5};
        System.out.println("Array length is: "+arr.length);
        System.out.println("1D Array: ");
        for (int x: arr) {
            System.out.print(" "+x);
        }
    }

//    c) Demonstrate a two-dimensional array.
    static void TwoDimensional(){
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("\n2D Array: ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("arr[%d][%d]=%d\n",i,j,arr[i][j]);
            }
        }
    }

//    d) Demonstrate a multi-dimensional array.
    static void MultiDimensional(){
        int[][][] arr = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        System.out.println("3D Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.printf("arr[%d][%d][%d]=%d\n",i,j,k,arr[i][j][k]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        OneDimensional();
        TwoDimensional();
        MultiDimensional();
    }
}
