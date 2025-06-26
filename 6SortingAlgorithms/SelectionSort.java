
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void selectionSort(int[]arr){
        for(int i =0 ; i<arr.length;i++){
            int last = arr.length-i-1; 
            int max = maxElement(arr, last);
            swap(arr,max,last);



// That means till one element less than the sorted ones
        }


        }
        static int maxElement(int[] arr, int end){
            int max = 0;
            for(int i=0; i<=end ; i++){

            if(arr[max]<arr[i]){
                    max = i;
                }
            }
            return max;
        }
        static void swap(int [] arr, int max,int end){
            int temp = arr[end];
            arr[end] = arr[max];
            arr[max]=temp;
            



        }
    }
    
