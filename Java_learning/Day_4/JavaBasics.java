/*
//  For Loops in Java

for(initialization; condition; update) {
    // code to be executed
}   
*/

import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(
                "For loop iteration: " + i  
            );

        }
        
    }
}

//  Print Square pattern using for loop

class SquarePattern {
    public static void main(String[] args) {
         System.out.print(" Using for loop:\n");
        for(int i = 1; i <= 4; i++) {
            System.out.println("*****");

        }
        // using while loop
        System.out.print(" Using while loop:\n");
        int lines = 1 ;
        while(lines <= 4) {
            System.out.println("*****");
            lines++;
        }
          

    }
}

//  Print Reverse of a number using while loop

class ReverseNumber {
    public static void main (String[] args) {
        int num = 12345;
        // int reverse = 0'
        while(num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        System.out.println();

    }
}


//  Reverse the given number

class ReverseNumber2 {
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
            
        }
        System.out.println("Reverse of the number is: " + reverse);
    }
}

