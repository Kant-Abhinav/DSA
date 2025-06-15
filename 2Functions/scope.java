public class scope {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        String name = "Abhinav";
        System.out.println(a);
        System.out.println(name);

        {
       // int a = 78;
        a = 100;//It is an updation of the value
        //We are changing the value of a so it will change it for all scopes
        System.out.println(a);
        int c = 99; //Here it is getting created inside this scope so, will be only here
        System.out.println(c);
        name = "Lord";// Change for all the scopes including the global scope
        System.out.println(name);
    }
    int c = 100;
    System.out.println(c);
    System.out.println(name);

    //Scoping in for loops

    for (int i=0 ; i<5;i++){
        System.out.println(i);
        int num = 90;
        a = 1000;
        
    }
    System.out.println(a);

    }
    


    
}
