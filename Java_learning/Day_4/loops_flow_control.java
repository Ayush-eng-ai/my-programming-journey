
import java.util.Scanner;

public class loops_flow_control {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            System.out.println("Break statement iteration: " + i);
        }
    }
}


//  Print number from 1 to 10 using while loop

// Note: This class should be in a separate file or have public removed from main class
class PrintNumbers {
    public static void main(String args[]) {
        int num = 1;
        while (num <= 10) 
            {
            System.out.println(num);
            num++;

        }
    }
}

//     public static void main(String[] args) {
//         int num = 1;
//         while (num <= 10) {
//             System.out.println(num);
//             num++;
//         }
//     }
// }

//  using for loop

class PrintNumbersFor {
    public static void main(String args[]) {
        for (int num = 1; num <= 10; num++){
            System.out.println(num);
        }
    }
}

// using input from user

class PrintNumbersInput {
    public static void main(String args[]) {
        Scanner ic = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to print: ");
        int num = ic.nextInt();
        int i = 1;
        while(i  <= num) {
            System.out.println(i);
            i++;
        }
    }
}

// Print sum of first n natural numbers
class SumNaturalNumbers {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of natural numbers to sum: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         int i = 1;
//         while(i <= n) {
//             sum += i; // sum = sum + i
//             i++;
//             // System.out.println(sum);
//         }
//         System.out.println("The sum of first " + n + " natural numbers is: " + sum);
//     }
// }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers to sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }

    
}
