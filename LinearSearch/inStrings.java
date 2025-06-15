import java.util.Scanner;
public class inStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char target = 'v';
        String name = "Abhinav";
        System.out.println(linearSearch(name,target));

        

        
    }
    static String linearSearch(String str, char input){
        if(str.length()==0){
            return "Missing";
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == input){
                return Integer.toString(i);              
            }

        }
        return "Missing";
        }
        


        }
        
    
    
    
