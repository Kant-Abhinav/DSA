public class minimumNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
        int target = min(arr);
        System.out.println(linearSearch(arr, target));


    }
    static int min(int[] arr){
        int element = arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<element){
                element  = arr[i];
                
            }
            

        }
        return element;
        
    }
    static int linearSearch(int[] arr, int target){
        for(int index=0;index<arr.length;index++){
             if(arr[index]== target){
                return index;
             }


        }
        return -1;
    }
}