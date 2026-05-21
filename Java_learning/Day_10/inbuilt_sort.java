// Inbuilt sorting in Java
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {

    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};

        // 1. Sort the array using Arrays.sort()
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3); // Sorts only the first three elements (5, 4, 1)
 
        // System.out.println("Sorted array: " + Arrays.toString(arr));


    // Reverse the array to get descending order
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); 
    // Sorts the first three elements in reverse order


        printArr(arr);
    }



    public static void printArr(Integer arr[]) {
        for(Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}