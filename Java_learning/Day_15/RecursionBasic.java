// Problem 1: Print numbers from n to 1 (Decreasing Order)


public class RecursionBasic{
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
    
    public static void main(String args[]) {
        // DECREASING ORDER
        int n = 10;
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
    }
}


