
/* 
    //  Find Product of a & b
*/
import java.util.*;


public class Question_1 {
   // Is main method ke bina program run NAHI hoga
    public static void main(String[] args) {
        // Function ko call karke result print karna
        int result = multiply(3, 5);
        System.out.println("Product is: " + result);
         
        //  second function call karna 
        int a = 6;
        int b = 5;
        int product = printProducts(a, b);
        System.out.println("Product is: " + product);
        product = printProducts(4, 6);
        System.out.println("Product is: " + product);
    }
 // Ye aapka multiply function hai
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    
    
    // second types solve this question
    public static int printProducts(int a, int b) {
        return a * b;
    }
}

class Question_2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        System.out.print("Enter a number to find its bionomial coefficient: ");
        int r = sc.nextInt();
        // System.out.println("Enter a number to find its factorial: " + n);
        // int n = 5;
        int factorial = print_factorial(n);
        int bionomial = bionomial_coefficient(n, r);
        System.out.println("Factorial of " + n + " is: " + factorial);
        System.out.println("Bionomial coefficient of " + n + " and " + r + " is: " + bionomial);
    }

    public static int print_factorial(int n) {
        // if (n == 0) {
        //     return 1;
        // } 
        // else {
        //     return n * print_factorial(n - 1);
        // }

        // using for Loop
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    
   public static int bionomial_coefficient(int n, int r) {
        int fact_n = print_factorial(n);
        int fact_r = print_factorial(r);
        int fact_n_r = print_factorial(n - r);

        int bionomial = fact_n / (fact_r * fact_n_r);
        return bionomial;
   } 
}


// Check if  a number is prime or not

class Question_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }

        
        }
        if(count == 2) {
            System.out.println(n + " is a prime number.");
        } 
        else {
            System.out.println(n + " is not a prime number.");
        }

         System.out.println(isPrime(13));
         System.out.println(isPrime_2(5));
}
    //  second way to solve this question

    public static boolean isPrime(int p) {
        boolean isPrime = true;
        for(int i = 2; i <= p-1; i++){
            if(p % i == 0) {
                isPrime = false;
                break;
            }  
        }
        return isPrime; 
    }
    public static boolean isPrime_2(int p) {
        if(p <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(p); i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Print all Prime in a Range 

class Questiona_4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int p = sc.nextInt();
        System.out.print("Enter a number to check if it is prime or not: ");
        // int m = sc.nextInt();
        System.out.println(isPrime_2(p));
        //  System.out.println(isPrime_2(m));
         // printPrimeInRange(p, m);
         printPrimeInRange(p);
    }
    public static boolean isPrime_2(int p) {
        if(p <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(p); i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrimeInRange(int p) {
        for(int i = 2; i <= p; i++) {
            if(isPrime_2(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println();

    }
    
    
}
//  Convert from Binary to Decimal
class Question_5 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
    binToDec(1010);
        decToBin(10);

    }
    public static void binToDec(int n) {
        int myNum = n;
        int pow = 0;
        int dec = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            dec = dec + lastDigit * (int)Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
       System.out.println("Decimal of " + myNum + " is: " + dec);

    }

    // Convert from Decimal to Binary
    public static void decToBin(int n) {
        int myNum = n;
        String bin = "";
        while(n > 0) {
            int rem = n % 2;
            bin = rem + bin;
            n = n / 2;
        }
        System.out.println("Binary of " + myNum + " is: " + bin);
    }
}

