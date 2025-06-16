import java.util.Scanner;
class thirdreturningValue {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The sum is = " + ans);
        
    }
    static int sum(){ //The return type must be pre defined
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;

    }
}
