
import java.util.Scanner; //Java.util.* is a package that we imported

public class inputs {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        // String input = In.nextLine(); //In.nextline() to cover the whole line
        // System.out.println(input);
        // int num = In.nextInt();
        // System.out.println(num);
        // Float num1 = In.nextFloat();
        // System.out.println(num1);


        // int a = In.nextInt();
        // int b = In.nextInt();

        // System.out.println(a+b);
        // System.out.println(a*b);

        float r = In.nextFloat();
        float Area = 3.14f * r * r; 
//If we won't tell what is the datatype of a decimal value by writing "f" afterwards
//Then the f value is taken as double on it's own by java as default, giving error        
        System.out.println(Area);
    }
    
}
