public class FirstEXamp {
    public static void main(String[] args) {
        sum(1);
        
    }
    static void sum(int n){
        System.out.print(n);
        sum1(2);
    }
    static void sum1(int n){
        System.out.print(n);
        sum2(3);

    }
    static void sum2(int n){
        System.out.print(n);
        sum3(4);
    }
    static void sum3(int n){
        System.out.print(n);
        sum4(5);
    }
    static void sum4(int n){
        System.out.println(n);
    }

    
}
