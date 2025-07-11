import java.util.ArrayList;
public class stringConcatenation {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println('a'+"b"); //One char and one string into string
        System.out.println((char) ('a'+3));//Type Casting
        
        System.out.println("a"+1); 

        //Using it in arraylist

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(56));
        // System.out.println(new Integer (45) 
        // + new ArrayList<>());

//we can't use "+" operator with non primitive datatypes if the other datatype
//isn't string
    
    }
}