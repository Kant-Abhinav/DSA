
public class fourthReturningValue {
    public static void main(String[] args) {
        String print = greet();
        System.out.println(print);
        //Main is the first function that runs!!
        int ans = sum(50,70);
        System.out.println(ans);

        String greetings = myGreet("Abhinav");
        System.out.println(greetings);
        


    }
    static String greet(){
        String greeting = "Hello Lord Abhinav";
        return greeting;

        
    }

    static int sum (int a, int b){
        int sum = a + b;
        return sum;



    }
    static String myGreet(String name){
        String message = "Thank you so much " + name;
        return message;
    }
}
