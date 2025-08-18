
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));



        
    }
    static void cyclicSort(int[] arr){
        int j=0;
        while(j<arr.length){
            int correctIndex = arr[j]-1;
            if(arr[correctIndex]!=arr[j]){
                swap(arr, j, correctIndex);

            }
            else{
                j++;
            }

        }

    }
    static void swap(int[] arr,int j,int index){
        int temp = arr[j];
        arr[j]=arr[index];
        arr[index]=temp;
    }
    
}
