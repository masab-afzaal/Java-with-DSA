import java.util.*;

public class basic_sorting {
    public static void bubbleSort(int array[]) {
    
        for(int i=0; i<array.length-1; i++) {
            
            for(int j=0; j<array.length-1-i; j++) {

                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int array[]) {
        for(int i=0; i<array.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }
    
    public static void insertionSort(int array[]) {
        for(int i=1; i<array.length; i++) {
            int curr = array[i];
            int prev = i-1;

            while(prev >=0 && array[prev] > curr) {
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;

        }
    }
    
    public static void countingSort(int array[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++) {
            largest = Math.max(largest,array[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<array.length; i++) {
            count[array[i]] ++;
        }
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                array[j] = i;
                j++;
                count[i] --;
            }
        }
    }
    public static void main(String args []) {
        //int array[] = {5,4,1,3,2};
        int array[] = {6,1,2,1,5,3,1,5,2,6,};

        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
         countingSort(array);

        // InBuilt Sort
        //Arrays.sort(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}