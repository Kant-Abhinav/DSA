public class palindrome {
    public static void main(String[] args) {
        int n = 123212;
        reverse(n);
        if(n==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        }
        
    
    static int sum  = 0;
    static void reverse(int n){
        if( n==0){
            return;
        }
        sum = sum*10 + n%10;
        reverse(n/10);
    }
}


