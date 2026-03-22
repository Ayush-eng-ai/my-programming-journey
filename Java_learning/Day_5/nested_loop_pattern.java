package Day_5;

// package Day_5;
// Print STAR pattern using nested loop


public class nested_loop_pattern {
 public static void main(String[] args) {
    int rows = 10; // Number of rows for the pattern
    for(int i = 1; i <= rows; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line after each row
    }
 }
    
}




//   Printed INVERTED-STAR pattern using nested loop

class InvertedStarPattern {
    public static void main(String[] args) {
        int rows = 10;//Number of rows for the pattern
        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

// Print HALF-PRRAMID pattern using nested loop
class HalfPyramidPattern {
    public static void main(String[] args0){
        int  rows = 10 ;// Number of rows for the pattern
        for(int i =1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
               System.out.print(j + " "); 
            }
            System.out.println();
        } 
    }   
}


//  Print CHARACTER pattern using nested loop
class CharacterPattern {
    public static void main(String[] args) {
       int rows = 10; // Number of rows for the pattern
       char ch = 'A'; // Starting character 


    //    Outer loop for rows
         for(int i = 1; i <= rows; i++) {
    //    Inner loop for columns
            for(int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
            // ch++; // Move to the next character
         }
    }
}

// Dry RUN of the above code
// For rows = 10, the output will be:
// A
// B C
// D E F    

class DRYRUNCharacterPattern {
    public static void main(String[] args) {
       int rows = 5; // Number of rows for the pattern
       char ch = 'A'; // Starting character 


    //    Outer loop for rows
         for(int i = rows; i >= 1; i--) {
    //    Inner loop for columns
            for(int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
            // ch++; // Move to the next character
         }
    }
}

