import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        //search in the array:return the index if item found
        //otherwise return -1 if not found
        Scanner in = new Scanner(System.in);
       




        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = in.nextInt();
        System.out.println((linearSearch(nums, target)));
    }

    static int linearSearch(int[] arr, int target){
        int element;
        //first clear out the edge statements
        if(arr.length==0){
            return -1;//because no such value will exist in an empty array
        }
        


        for(int index = 0; index <arr.length; index++){
            element = arr[index];

            if(element == target){
                return index;
            }


            
        }
        
        return -1;
    }
    
}
