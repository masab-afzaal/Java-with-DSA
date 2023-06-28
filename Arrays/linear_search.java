import java.util.*;

public class linear_search {
    public static int linearSearch(int numbers[], int key){
        
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }   

        }
        return -1;
    }
    public static void main(String args []){

        int numbers [] = {3,5,2,4,6,7,3,1};
        int key = 5;
        System.out.println(linearSearch(numbers,key));
        
    }
}