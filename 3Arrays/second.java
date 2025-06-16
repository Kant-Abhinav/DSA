
import java.util.Arrays;





public class second {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=233;
        arr[3]=543;
        arr[4]=3;
        
        


        for (int i=0; i<arr.length;i++) {
        System.out.println (arr[i]); 
        }

        System.out.println(Arrays.toString(arr));
        //Array is converted into string reference = arr array and then printed


      //---------------------for each loop----------------------------------------

      

    for (int num:arr) {//This means int num is one element corresponing to arr array
        System.out.println(num); 
        //num represents the elements in the array
    }
    
       
    }
    
    
}
