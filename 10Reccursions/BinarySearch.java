public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 10;
        
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[]arr, int target,int start , int end ){
        if(start>end){
            return -1;
        }
        int mid = start+((end-start)/2);

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
      
        return search(arr,target,mid+1,end);
        
        
    }
    
}
