
import java.util.*;



public class Searchin2Darrays {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12},
        };
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int value = arr[i][j];
                if(value == target){
                    return new int[]{i,j};
                    //This denotes return an array with i and j as elements
                }

            }

        }
        return new int[]{-1,-1};

    }
    
}
