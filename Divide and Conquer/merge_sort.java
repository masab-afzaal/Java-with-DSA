import java.util.*;

public class merge_sort {

    public static void mergesort(int arr[], int si, int ei) {
        // Base case: If the start index is greater than or equal to the end index, the array is already sorted or empty
        if (si >= ei) {
            return;
        }
        // Calculate the middle index
        int mid = si + (ei - si) / 2;
        // Recursively sort the left half of the array
        mergesort(arr, si, mid);
        // Recursively sort the right half of the array
        mergesort(arr, mid + 1, ei);
        // Merge the two sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged result
        int temp[] = new int[ei - si + 1];
        int i = si; // Start index of the left half
        int j = mid + 1; // Start index of the right half
        int k = 0; // Index for the temporary array

        // Compare elements from the left and right halves and store them in the temporary array in sorted order
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements from the right half, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements from the temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int n[] = { 5, 7, 6, 5, 8, 2 };
        // Call the mergesort method to sort the array
        mergesort(n, 0, n.length - 1);
        // Print the sorted array
        System.out.println(Arrays.toString(n));
    }
}
