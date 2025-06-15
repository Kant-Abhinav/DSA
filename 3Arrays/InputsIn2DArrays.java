import java.util.Arrays;
import java.util.Scanner;
public class InputsIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr.length);//It will give no. of rows


        Scanner in = new Scanner(System.in);

        for(int row=0; row < arr.length;row++){
            //for each column in every row
            for(int col = 0; col <arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT
        for(int row = 0; row<arr.length;row++){

            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] +" ");

            }
            System.out.println();
    }  

    //  OR

    for(int row = 0; row<arr.length;row++){


  System.out.println(Arrays.toString(arr[row]));


  //At first the loop will run and print arr[0];
  //In arr[0] there will columns that will be printed inside of it


  
}
//forEach 

//Easiest way is to use forEach loop for arrays

for(int[] arr1 : arr){
    System.out.println(Arrays.toString(arr1));
}
} 
}