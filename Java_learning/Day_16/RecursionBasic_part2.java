public class RecursionBasic_part2 {
/* 
// Problem 1: Tiling Problem
        Given a 2*n board and tiles of size 2*1, count the number of ways to tile the given board using the 2*1 tiles. The tiles can either be placed horizontally or vertically.
*/
    public static int tilingProblem(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        // Place the tile vertically
        int verticalPlacement = tilingProblem(n - 1);
        // Place the tile horizontally
        int horizontalPlacement = tilingProblem(n - 2);
        // Total placements
        return verticalPlacement + horizontalPlacement;
    }

// Problem 2: Remove  Duplicates in String.
    public static String removeDuplicates(String str) {
        // Base Case
        if (str.length() <= 1) {
            return str;
        }

        // Recursive Case
        char firstChar = str.charAt(0);
        String remainingString = removeDuplicates(str.substring(1));
        if (remainingString.charAt(0) == firstChar) {
            return remainingString;
        } else {
            return firstChar + remainingString;
        }   
    }



    public static void main(String args[]) {
    // Test the tiling problem
        int n = 4; // Length of the board
        System.out.println("Number of ways to tile the board: " + tilingProblem(n));

    // Test the remove duplicates problem
        String inputString = "aabbcc";
        System.out.println("String after removing duplicates: " + removeDuplicates(inputString));   
        
    }
}