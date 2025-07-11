import java.util.*;
public class pallindrome {
    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        String check = In.nextLine();
        check = check.toLowerCase();

        System.out.println(isPalindrome(check));

        
    }

    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        //here it is .length() because in strings it is a class and it uses the same .length function
        //internally it is also working as an array

        while(start<=end){

            if(str.length()==0|| str==null){
                return true;
                
            }
            if(str.charAt(start) == str.charAt(end)){
                start = start+1;
                end = end-1;
            }
            else{
                return false;
            }
        }

        return true;



    }
}
