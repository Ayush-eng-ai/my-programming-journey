// Basic Sorting Algorithms

/* 
1. Bubble Sort
2. Selection Sort   
3. Insertion Sort
4. counting Sort
*/  

// Bubble Sort
// import java.util.Arrays;
public class sorting_Algo {


    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length - 1; turn++){
            for (int j = 0; j <= arr.length - 2 - turn; j++){
                if(arr[j] > arr[j+ 1 ]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
 
                }

            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int tem = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tem;

        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int currVal = arr[i]; // Index nahi, value store karein
            int prev = i - 1;
        
        // Element ko aage shift karein
            while(prev >= 0 && arr[prev] > currVal) { 
                arr[prev + 1] = arr[prev];
                prev--;
        }
        // Sahi jagah par value insert karein
            arr[prev + 1] = currVal; 
        }
    }


    // Counting Sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    
    

    // public static void main(String args[]) {
    //     // call bubble sort
    //     int arr[] = {5, 1, 4, 2, 8};
    //     bubbleSort(arr);
    //     printArr(arr);

    //     // call selection sort
    //     int arr1[] = {64, 25, 12, 22, 11};
    //     selectionSort(arr1);
    //     printArr(arr1);
    // }



    
    // Main function where terminal input will be checked
    public static void main(String args[]) {
        
        // 1. If no name is given in the terminal, tell the user what to write
        if (args.length == 0) {
            System.out.println("Please write 'selection' or 'bubble' or 'insertion' or 'counting' after the command!");
            System.out.println("Example: java sorting_Algo selection");

            return;
        }

        // 2. Picking up the first word from the terminal as the user's choice
        String choice = args[0];

        // 3.If the user has typed 'bubble'
        if (choice.equalsIgnoreCase("bubble")) {
            int arr[] = {5, 1, 4, 2, 8};
            System.out.print("Running Bubble Sort... Output: ");
            bubbleSort(arr);
            printArr(arr);
        } 
        // 4. If the user has typed 'selection'
        else if (choice.equalsIgnoreCase("selection")) {
            int arr1[] = {64, 25, 12, 22, 11};
            System.out.print("Running Selection Sort... Output: ");
            selectionSort(arr1);
            printArr(arr1);

        } 
        // 5. If the user has typed 'insertion' 
        else if (choice.equalsIgnoreCase("insertion")) {
            int arr2[] = {12, 11, 13, 5, 6};
            System.out.print("Running Insertion Sort... Output: ");
            insertionSort(arr2);
            printArr(arr2);

        }


        // 6. If the user has typed 'counting'
        else if (choice.equalsIgnoreCase("counting")) {
            int arr3[] = {4, 2, 2, 8, 3, 3, 1};
            System.out.print("Running Counting Sort... Output: ");
            countingSort(arr3);
            printArr(arr3);
        }


        // 7. If something else entirely was written
        else {
            System.out.println("Unknown command! Use 'bubble', 'selection', 'insertion', or 'counting'.");
        }
    }
}