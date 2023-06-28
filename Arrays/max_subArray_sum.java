import java.util.*;

public class max_subArray_sum {

    public static void bruteForce(int array[]) {
        int currSum=0, maxSum=Integer.MIN_VALUE;
        
        for(int i=0; i<array.length; i++) {

            for(int j=i; j<array.length; j++) {
                currSum = 0;
                for ( int k=i; k<=j; k++) {
                    currSum += array[k];
                }
                //System.out.println(currSum);

                if ( maxSum < currSum ) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sub-Array Sum is " + maxSum);
    }
    
    public static void prefix(int array[]) {
        int currSum=0, maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }
        
        for(int i=0; i<array.length; i++) {

            for(int j=i; j<array.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                if ( maxSum < currSum ) {
                    maxSum = currSum;
                }
        
            }
        }

       
        System.out.println(maxSum);
        
    }
    
    public static void kadanes(int array[]) {
        int maxSum=Integer.MIN_VALUE, currSum=0; 
        for (int i=0; i<array.length; i++) {
            currSum += array[i];
            if( currSum < 0 ) {
                currSum=0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String args []) {
        int array[] = {1, -2, 6, -1, 3};
        //int array[] = {-2,-3,4,-1,-2,1,5,-3};

        bruteForce(array);
        prefix(array);
        kadanes(array);
    }
}