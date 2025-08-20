public class countZeroes {
    public static void main(String[] args) {
        count =0;
        zero(1030230340);
        System.out.println(count);

        
    }
    static int count = 0;
    static void zero(int n){
        if(n==0){
            return;
        }
        if(n%10==0){
            count=count+1;
        }
        zero(n/10);
    }
    
}
