import java.util.Scanner;
public class searchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {18,12,-7,3,14,28};
        int target = in.nextInt();
        System.out.println(linearSearch(arr, 1, 4, target));
        //Search for "3" in the range of 1 to 4
    }
     static int linearSearch(int[] arr, int start,int end,int target){
        int element;
        //first clear out the edge statements
        if(arr.length==0){
            return -1;//because no such value will exist in an empty array
        }
        


        for(int index = start; index <= end; index++){
            element = arr[index];

            if(element == target){
                return index;
            }


            
        }
        
        return -1;
    }

    
    
    
}
