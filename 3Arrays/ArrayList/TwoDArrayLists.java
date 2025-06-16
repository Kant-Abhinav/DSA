import java.util.ArrayList;
import java.util.Scanner;
public class TwoDArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <ArrayList <Integer> > list = new ArrayList<>();
        //This makes an empty list here

        //Now we will Initialise our code here
        //Initialisation

        for(int i =0; i<3 ; i++){
            list.add(new ArrayList<>());
        } //This inner arraylist is still empty.
        //So we will add values or columns now.

        //add elements and taking inputs

        for(int row = 0 ; row<3 ; row++){
            for(int col=0; col<3;col++){
                list.get(row).add(in.nextInt());
    //This means that take the index of list arraylist and add a new input.
            }
        }

        System.out.println(list);


        
    
    }
    
}
