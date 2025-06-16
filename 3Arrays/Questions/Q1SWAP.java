
import java.util.Arrays;

public class Q1SWAP {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,66};
        swap(arr,0,5);

        


    }
    static void swap(int[] arry , int index1 , int index2){
        int change = arry[index1];
        arry[index1] = arry[index2];
        arry[index2] = change;

        System.out.println(Arrays.toString(arry));


        





    }
    
}
