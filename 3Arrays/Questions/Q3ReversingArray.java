import java.util.Arrays;

public class Q3ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);


    }
    static void reverse(int[] arry){
        for(int i=0;i<(arry.length)/2;i++){
            int a = arry[i];
            arry[i] = arry[arry.length-1-i];
            arry[arry.length-1-i] = a;

        }
        System.out.println(Arrays.toString(arry));

    }


}