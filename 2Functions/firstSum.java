import java.util.* ;
public class firstSum {
    public static void main(String[] args) {
//Here we are gonna define functions pretty much similar to that like in javascript
         sum(); //Calling out the sum function here to execute it
    }

    static void sum(){ //Here void means that we don't want to return anything i.e null
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The Sum = " + sum);

    }
    
}
