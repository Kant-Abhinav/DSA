
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        int n = arr.length-1;
        System.out.println(Arrays.toString(reverse(arr,0,n)));
        

    }
    static int[] reverse(int[]arr ,int a ,int b){
        if(a<b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b] = temp;
            reverse(arr, a+1,b-1);
        }
        
        return arr;
    }
    
}  
