import java.util.ArrayList;
import java.util.Scanner;
public class list2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
         ArrayList <Integer> list = new ArrayList<>();

         //Input
        for(int i = 0 ; i<5 ;i++){
            int input = in.nextInt();
            list.add(input);
        }

        //OUTPUT

        //Using for Each loop

        /*  for(int elements:list){
             System.out.println(elements);
        }             */

       for(int i=0;i<5;i++){
        System.out.println(list.get(i) + " ");
        //list[index] won't work here
       }
       System.out.println(list);

    }
    
}
