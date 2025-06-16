
public class swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a);
        System.out.println(b);
        
    }
    static void swap(int a , int b){
        int c = a;
        b=a;
        c=b;
        //Here it is a different function. So, the scope of the main func won't affect this func
        //This function doesn't know what is a and b 
    }
    //Value isn't changing because the changes have been done in the scope of the function only
    //Local scopes donot affect the global scopes
}
