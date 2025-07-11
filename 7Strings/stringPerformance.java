public class stringPerformance {

    public static void main(String[] args) {
String series = ""; 
        for(int i = 0; i<26 ; i++){
           char ch = ((char) ('a' + i));
           series += ch;

        }
        System.out.println(series);

    //But the time complexity is O(N^2)
    //So it is not the optimised code for printing all the alphabets
    }
    
}
