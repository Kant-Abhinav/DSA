
//Note: Shadow doesn't take place in a function or method
class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;//known as declaration

//System.out.println(x); giving error because x is only declared but not initialised

        x = 40;//known as initialisation
        //"The scope will begin when the value is initialised"


        System.out.println(x);
        int vary = fun();
        System.out.println(vary);
    

        
    }
    static int fun(){
      return x+1;

    }
    
}
