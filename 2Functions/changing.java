
import java.util.Arrays;

public class changing {
    public static void main(String[] args) {
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0] = 99;
        //if we make a change to the object via reference variable num
        //Then the real object will be changed
        //In non primitive data types it happens
        //Primite data types donot change on this
    }
}
