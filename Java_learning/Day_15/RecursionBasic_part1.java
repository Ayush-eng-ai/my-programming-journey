// Problem 1: Print numbers from n to 1 (Decreasing Order)


public class RecursionBasic_part1{
    public static void printDeacreasing(int n) {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n + "  ");
        printDeacreasing(n-1);
    }

// Problem 2: Print numbers from 1 to n (Increasing Order)

    public static void printInc(int n) {
        if(n == 1)
        {
            System.out.print(n + "  ");
             return;
        }
        printInc(n-1);
        System.out.print(n + "  ");
    }


// Problem 3: Print  factorial of a number n.
    public static int factorial(int n){
        if(n == 0 || n ==1 )
        {
            return 1;
        }
        int fnm1 = factorial(n-1);
        System.out.println("Factorial of " + (n-1) + " is: " + fnm1);
        int fn = n * fnm1;
        System.out.println("Factorial of " + n + " is: " + fn);
        return fn;

        // if(n == 0 || n == 1)
        // { 
        //     return 1;
        // }
        // return n * factorial(n-1);

    }

// Problem 4: Print sum of first n natural numbers.
    public static int sum(int n) {
        if(n == 0)
        {
            return 0;
        }
        int snm1 = sum(n-1);
        // System.out.println("Sum of first " + (n-1) + " natural numbers is: " + snm1);
        int sn = n + snm1;
        // System.out.println("Sum of first " + n + " natural numbers is: " + sn);
        return sn;

        // if(n == 0)
        // {
        //     return 0;
        // }
        // return n + sum(n-1);
    }

// Problem 5: Print  Nth Fibonacci number.
    public static int fibanacci(int n) {
        if(n == 0 || n ==1)
        {
            return n;
        
        }
        int fnm1 = fibanacci(n - 1);
        int fnm2 = fibanacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;


        // if(n == 0 || n == 1)
        // {
        //     return n;
        // }
        // return fibanacci(n-1) + fibanacci(n-2);
    
    }

// Problem 6: Check if a given array is sorted or not.
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1)
        {
            return true; 
        }
        if(arr[i] > arr[i + 1])
        {
            return false;
        }
        return isSorted(arr, i + 1);
    }

// Problem 7: write a function to find the occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

// Problem 8: write a function to find the last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length)
        {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if(isFound != -1)
        {
            return isFound;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return -1;
    }

// Problem 9: Print  x^n (x raised to the power n).
    public static int power(int x, int n) {
        if(n == 0)
        {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;

        // if(n == 0)
        // {
        //     return 1;
        // }
        // return x * power(x, n - 1);
    }  
    
// Problem 10:  Optimized Power Function (x^n) in O(log n) time complexity, space complexity O(log n) due to recursive stack space.
    
    public static int optimizedPower(int x, int n) {
        if(n == 0)
        {
            return 1;
        }
        int xnm1 = optimizedPower(x, n / 2);
        int xn = xnm1 * xnm1;
        if(n % 2 == 1)
        {
            xn = x * xn;
        }
        return xn;

        // if(n == 0)
        // {
        //     return 1;
        // }
        // int xnm1 = optimizedPower(x, n / 2);
        // int xn = xnm1 * xnm1;
        // if(n % 2 == 1)
        // {
        //     xn = x * xn;
        // }
        // return xn;       
    }
    public static void main(String args[]) {
        // DECREASING ORDER
        int n = 5;
        printDeacreasing(n);

        // INCREASING ORDER
        // System.out.println();
        printInc(n);

        // FACTORIAL
        System.out.println();
        System.out.println();
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

        // SUM OF FIRST N NATURAL NUMBERS
        System.out.println();
        int s = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + s);

        // NTH FIBONACCI NUMBER
        System.out.println();
        int fib = fibanacci(n);
        System.out.println("Nth Fibonacci number is: " + fib);

        // CHECK IF AN ARRAY IS SORTED OR NOT
        System.out.println();
        int arr[] = {1, 2, 3, 4, 5};
        boolean sorted = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + sorted);

        // FIRST OCCURENCE OF AN ELEMENT IN AN ARRAY
        System.out.println();
        int key = 3;
        int index = firstOccurence(arr, key, 0);
        if(index != -1)
        {
            System.out.println("Element " + key + " is found at index: " + index);
        }
        else
        {
            System.out.println("Element " + key + " is not found in the array.");
        }   

        // LAST OCCURENCE OF AN ELEMENT IN AN ARRAY
        System.out.println();
        int arr2[] = {1, 2, 3, 4, 5, 3};
        int lastIndex = lastOccurence(arr2, key, 0);
        if(lastIndex != -1)
        {
            System.out.println("Last occurrence of element " + key + " is at index: " + lastIndex);
        }
        else
        {
            System.out.println("Element " + key + " is not found in the array.");
        }   

        // X RAISED TO THE POWER N
        System.out.println();
        int x = 2;
        int p = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + p);  
        
        
        // OPTIMIZED POWER FUNCTION
        System.out.println();
        int op = optimizedPower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + op);
            
    }
}


