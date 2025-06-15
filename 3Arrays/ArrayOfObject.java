import java.util.Arrays;
import java.util.Scanner;
public class ArrayOfObject{
    public static void main(String[] args) {
        //Arrays of Objects
        String[] str = new String[4];

        Scanner in = new Scanner(System.in);
        for(int i = 0; i<str.length;i++){
            str[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(str));

//for each loop

        for(String elements : str){
            System.out.println(elements);
        }
    }
}