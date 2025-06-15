
import java.util.Arrays;

public class functionOverloading {
    //It means that two functions of the same name can exist- 
    //-if the parameters inside the () of the functions are different

    public static void main(String[] args) {
       

        fun(23);
        fun("Abhinav");

        demo(1,2,3,4,5,78,76,54);//printed the int wala demo function
        demo("Hello", "v", "gfc", "gth", "ghtj");
        //printed the string wala demo function  

    }
    //Note: We cannot define new static functions inside the main static function
     static void fun(int a){
            System.out.println(a);
        }
        static void fun(String name){
            System.out.println(name);
        }
        static void demo(int ...v){
          System.out.println(Arrays.toString(v));
        }
        static void demo( String ...v){
            System.out.println(Arrays.toString(v));

        }
}