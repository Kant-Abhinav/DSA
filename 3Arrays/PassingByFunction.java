
import java.util.Arrays;

public class PassingByFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,9,12};
        System.out.println(Arrays.toString(nums)); 
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int change(int[] arr){//function for an array
        arr[0] = 99;
        return 0 ;
    }
    
}
