import java.util.Scanner;
public class flooring {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,9,14,16,18};
        int[] arr2 = {18,16,14,9,5,3,2};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(ceiling(arr1,target));

        
    }
    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;


    if(arr[start]<=arr[end]){
        
        
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==target){
                return target;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }


            }
            return arr[end];
        }
        else{

        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==target){
                return target;
            }
            else if (arr[mid]<target){
                end = mid-1;
            }
            else{
                start = start+1;
            }


            }
            return arr[start];

        }
  
    

        }
    }

    


    

