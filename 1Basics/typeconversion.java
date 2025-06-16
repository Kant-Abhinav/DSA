




public class typeconversion {
    public static void main(String[] args) {
         int b = (int) (99.99f); //syntax of type-casting
    System.out.println(b);

    float c = 77.78f;
    int d = (int) c;
    System.out.println(d);

    double g = 87.67;
    int e = (int) g;
    System.out.println(e);

    char ch1 = 'a';
    char ch2 = 'z';
    // int num1 =  ch1;
    // int num2 =  ch2;
    // System.out.println(num1);
    // System.out.println(num2);
    //Here we changed a float value into integer by writing the values of int

    //Type promotion, JAVA promotes bytes,char and short values to integer on it's own
    //If operand is long,float,double then the final value will be converted into long, float or double

    char first = 'a';
    char second = 'b';
    System.out.println((int) first);
    System.out.println((int) second);
    System.out.println(second-first);

    int num1 = 67;
    float num2 = 45.5f;
    long num3 = 76;
    double num4 = 98.89;
    double num5 = num1+num2+num3+num4;
    System.out.println(num5);
    

    byte l = 2; //This byte l will automatically be converted into integer
    byte m = (byte)(l*2);
    System.out.println(m);

    int $ = 56;
    System.out.println($);


    }
   
    
}
