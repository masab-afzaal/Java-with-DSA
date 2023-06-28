import java.util.*;
public class largest_number {
    public static void main (String args []){

        int numbers [] = { 19, 8 , 43, 76, 54, 12, 80, 9};
        int largest = Integer.MIN_VALUE; // -INFINITY
        int smallest = Integer.MAX_VALUE; // +INFINITY
        
        for ( int i = 0; i < numbers.length; i++ ){
            if ( largest < numbers[i]){
                largest = numbers[i];  
            }
            if ( smallest > numbers[i]){
                smallest = numbers[i];  
            }  
            
        }
        System.out.println("Largest value is : " + largest);
        System.out.println("Smallest value is : " + smallest);
    }
}
