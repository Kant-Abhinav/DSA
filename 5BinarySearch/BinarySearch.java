public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-16,-12,-4,0,1,2,3,4,15,16,18,22,45,89};
        int target = 22;
        System.out.println(binarySearch(arr, target));
        //return the index
        //return -1 if it does not exist
        
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //Find the middle element
            int mid = start + (end-start)/2; //might be possible the start + end goes beyond the range of integer

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
                //After some iterations this condition must get true
                //If it does not then that does ki target does not belong to the given array

            }
        }
        return -1; //i.e the value doesnot exist in the array

    }

    
}
