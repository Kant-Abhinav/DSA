
import java.util.Arrays;

public class variableArgs{
    public static void main(String[] args) {

        fun(2,3,4,5,6,7,8,9,10);
        multiple(2,3, "Abhinav");
    }
    
    
    static void fun (int ...v){//int ...v refers to store it in an integer array
        System.out.println(Arrays.toString(v));

        }
        static void multiple (int a , int b , String ...v){
        //here the ...v is the variable length argument
        //variable length args should be always declared in the last like after primitive datatypes

    }
    }
