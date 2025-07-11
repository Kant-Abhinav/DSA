
public class first {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";

        System.out.println(a==b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        //.name refers to only the value of the string
        //It does not care about the reference variable is pointing out to the same object or not

        //thus these ref variable are pointing out to two different objects

        System.out.println(name1.charAt(4));
        //equilvalent to array element print
    
        Integer num = new Integer (88);
        System.out.println(num.toString());
        System.out.println(num);

        //both the statements are the same as the one another

        System.out.printf("Pi: %.3f", Math.PI);

    }
    
}
