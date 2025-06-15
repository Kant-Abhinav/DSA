public class Q2MaxmValue {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(maxm(arr));
       

    }
    static int maxm(int[] arr){
         int max = 0;

        for(int i=0;i<arr.length;i++){
        
           if(max<arr[i]){
            max = arr[i];
           }
            
        }
        return max;

    }
    
}
