package Days_8;

/*
    // Operations  in arrays
    1. creation of an array
    2. Input in an array
    3. Output of an array
    4. Update an array
    5. Deletion in an array
    6. Searching in an array
    7. Sorting an array
    8. Merging of two arrays
*/

import java.util.*;


public class arrays_1 {
    public static void main(String args[]){
        // creation of an array
        int marks[] = new int[50];

        // input in an array
        Scanner sc = new Scanner(System.in);
        // int phy
        // phy = sc.nextInt();
        // marks[0] = phy;

        // Calculate length of an array
        int length = marks.length;
        System.out.println("Length of marks array: " + length);


        System.out.println("Enter the Physics marks:");
        marks[0] = sc.nextInt();   // physics
        System.out.println("Enter the Chemistry marks:");
        marks[1] = sc.nextInt();   // chemistry 
        System.out.println("Enter the Mathematics marks:");
        marks[2] = sc.nextInt();
        System.out.println("Enter the Biology marks:");
        marks[3] = sc.nextInt();   // mathematics

        // output of an array
        System.out.print("phy: " + marks[0]);
        System.out.print(" chem: " + marks[1]);
        System.out.print(" math: " + marks[2]);
        System.out.print(" bio:   " + marks[3]);

        // 
        // Calculate  percentage of marks
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
        System.out.println("Percentage: " + percentage);

        // 

        sc.close();
    }
    
}



/*
//  Passing arrays as argument to a function

    1. pass by value
    2. pass by reference


*/


class arrays_2 {
    public static void update(int marks[], int nonChangable) {

        nonChangable = 10; // update nonChangable to 10
        for(int i = 0; i < marks.length; i++) {
            // marks[i] = marks[i] + nonChangable; // update marks by adding nonChangable
                marks[i] = marks[i] + 5; // update marks by adding 5
        }
    }
    public static void main(String args[]) {
        int marks[] = {85, 90, 95, 80};
        int nonChangable = 5;
        update(marks, nonChangable); // pass by reference
        System.out.println(nonChangable); // 5

        // Print our marks
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println();

    
    }
}



/* 
//  Linear  Search
        find the index of element in a given array


*/

class LinearSearch {
    public static int linearSearch(int arr[], int key) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i; // return index of the key
            }
        }
        return -1; // return -1 if key is not found
    }
    public static int linearSearch(String arr[], String key) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(key)) {
                return i; // return index of the key
            }
        }
        return -1; // return -1 if key is not found
    }
    public static void main(String args[]) {
        // int num[] = {10, 20, 30, 40, 50};
        String menu[] = {"Pizza", "Burger", "Pasta", "Fries", "Coke"};  
        // int key = 30;
        String key = "Pasta";

        int index = linearSearch(menu, key);
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


    }


    



    // public static int linearSearch(int arr[], int key) {
    //     for(int i = 0; i < arr.length; i++) {
    //         if(arr[i] == key) {
    //             return i; // return index of the key
    //         }
    //     }
    //     return -1; // return -1 if key is not found
    // }
    // public static void main(String args[]) {
    //     int arr[] = {10, 20, 30, 40, 50};
    //     int key = 30;
    //     int result = linearSearch(arr, key);
    //     if(result != -1) {
    //         System.out.println("Element found at index: " + result);
    //     } else {
    //         System.out.println("Element not found in the array.");
    //     }
    // }
}


/* 
        //  Largest Number
        find the largest number in a given array

*/

class LargestNumber {
    public static int largestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE; // initialize largest to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // initialize smallest to the largest possible integer
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i]; // update largest if current element is greater
            }
            if(arr[i] < smallest) {
                smallest = arr[i]; // update smallest if current element is smaller
            }
        }
        System.out.println("Smallest number in the array is: " + smallest);
        return largest;
    }
    public static void main(String args[]) {
        int num[] = {10, 20, 30, 40, 50};
        // int largest = num[0]; // assume first element is largest
        // for(int i = 1; i < num.length; i++) {
        //     if(num[i] > largest) {
        //         largest = num[i]; // update largest if current element is greater
        //     }
        // }
        int largest = largestNumber(num);
        System.out.println("Largest number in the array is: " + largest);

    }
}


/*
    // Binary Search
        find the index of element in a given sorted array

        prerequisite: array should be sorted
        
    //  Pseudo code for binary search
    start = 0;
    end = arr.length - 1;
    while(start <= end)
        find mid 

        compared mid & key
        mid == key -> return mid
        mid < key -> search in the right half (start = mid + 1)
        mid > key -> search in the left half (end = mid - 1)    
    
    {
        mid = (start + end) / 2;
        if(arr[mid] == key) {
            return mid; // return index of the key
        } else if(arr[mid] < key) {
            start = mid + 1; // search in the right half
        } else {
            end = mid - 1; // search in the left half
        }
    }


         

*/

class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                return mid; // return index of the key
            } else if(arr[mid] < key) {
                start = mid + 1; // search in the right half
            } else {
                end = mid - 1; // search in the left half   
            }
        }
        return -1; // return -1 if key is not found
    }
    public static void main(String args[]) {
        int arr[] = {12,24,36,48,60,72,84,96};
        int key = 60;
        int result = binarySearch(arr, key);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}


/*
    //  Reverse an array
        reverse the elements of a given array

*/

class ReverseArray {
    public static void reverse(int arr[]) {
        int first = 0, last = arr.length-1;
        while(first < last) {
            // swap arr[first] and arr[last]
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }


    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5};
        // int start = 0;


        reverse(num);
        // Print the reversed array
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    

    }
}


/*
    //  Pairs in Array
        find all pairs of elements in a given array
        1. sum problem - find pairs of elements in an array whose sum is equal to a given target
        2. difference problem - find pairs of elements in an array whose difference is equal to a given target
        3. product problem - find pairs of elements in an array whose product is equal to
        4. quotient problem - find pairs of elements in an array whose quotient is equal to a given target 

*/
 
class PairsInArray {
    public static void printpairs(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 5;

        printpairs(arr, target);


    }
}



/* 
        //  Print all subarrays of an array
        A subarray is a contiguous part of an array. For example, if the array is [1, 2, 3], then the subarrays are:
        [1]
        [2]
        [3]
        [1, 2]
        [2, 3]
        [1, 2, 3]

*/


class Subarrays {
    public static void printSubarrays(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                System.out.print("Subarray: [");
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        } 
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printSubarrays(arr);
    }
}



