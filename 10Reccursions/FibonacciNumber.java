
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        System.out.println(Fibo(n));
        
    }
    static int Fibo(int n){
        if(n<2&&n>=0){
            return n;
        }
        else if(n<0){
            System.out.println("Fibbonaci numbers for negative integers isn't possible");
            return -1;
        }
        else{
            return Fibo(n-1)+ Fibo(n-2);
        }
    }
    
}
