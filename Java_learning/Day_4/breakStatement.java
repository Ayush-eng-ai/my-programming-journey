// Using break and continue statements in Java
// first we will see the break statement

import java.util.*;
public  class breakStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i = i + 2){
            if(i == 5) {
                break;  // when i is equal to 5, the loop will terminate and control will exit the loop
            }
            System.out.println("Break statement iteration: " + i);
        }
    }
}

//  Using continue statement in Java

class continueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i = i + 2){
            if(i == 5) {
                continue;  // when i is equal to 5, the loop will skip the current iteration and move to the next iteration
            }
            System.out.println("Continue statement iteration: " + i);
        }
    }
}



//  Display all numbers entered by user except multiples of 10 using continue statement
class continueStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num % 10 == 0) {
                continue; // if the number is a multiple of 10, skip the current iteration and move to the next iteration
            }
            System.out.println("Number: " + num);
        }
    }
}


// using do while loop
class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            
            if(num % 10 == 0) {
                System.out.println("Number is a multiple of 10, skipping...");
                continue; // if the number is a multiple of 10, skip the current iteration and move to the next iteration
            }
            System.out.println("You entered: " + num);
        } while(true); // this will create an infinite loop, you can add a condition to break the loop if needed;
    }
}



// Check  if  a number is prime or not

class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <=  Math.sqrt(num); i++){
            if(num % i == 0 ) {
                isPrime = false;
                break; // if the number is divisible by any number other than 1 and itself, it is not a prime number, so we can break the loop
            }
        } {
            if(isPrime == true) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}



 