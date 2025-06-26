
import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {69,96,196,169,876,789,192,656};
        bubbleSort(arr);
        //This funtion calling has now changed the arr internals
        //Now just printing it will give us a sorted array
        System.out.println(Arrays.toString(arr));


    }

    
    //Make a void method as nothing has to be returned
    static void bubbleSort(int[] arr){
        
        //Make it go through till sorting is done
        for(int i = 0; i<arr.length;i++){
            boolean swapped;
            //Index from 1 till arr.length-i traversing and swap
            for(int j = 1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
                else{
                    swapped =false;
                }
               
                //To avoid checking in one already sorted array

            }
            if(swapped=false){
                break;
            }
        }
    }
    
}
