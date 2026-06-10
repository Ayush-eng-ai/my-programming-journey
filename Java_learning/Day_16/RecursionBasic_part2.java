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

// Problem 3: Friends Pairing Problem:
		// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total 	number of ways in which friends can remain single or can be paired up.

	public static int friendsPairing(int n) {
		if(n == 1 || n == 2) {
			return n;
		}

		//choice
		//single
		int fnm1 = friendsPairing(n-1);
		
		//Pair
		int fnm2 = friendsPairing(n-2);
		int pairingWays = (n - 1) * fnm2;
		
		//total Ways
		int totWays = fnm1 + pairingWays;
		return totWays;
	}


// Question 4: Binary Strings Problem
            // Print all binary strings of size N without consecutive 1s.
    public static void printBinStrings(int n, int LastPlace, StringBuilder str) {
        // Base Case
        if(n == 0) {
            System.out.println(str);
            return; 
        }
        // Recursive Case
        // Place 0 at the current position
        str.append('0');
        printBinStrings(n - 1, 0, str);
        str.deleteCharAt(str.length() - 1); // Backtrack    
        // Place 1 at the current position (only if the last placed character is not 1)
        if(LastPlace == 0) {
            str.append('1');
            printBinStrings(n - 1, 1, str);
            str.deleteCharAt(str.length() - 1); // Backtrack
        }

    }

    public static void main(String args[]) {
    // Test the tiling problem
        int n = 4; // Length of the board
        System.out.println("Number of ways to tile the board: " + tilingProblem(n));

    // Test the remove duplicates problem
        String inputString = "aabbcc";
        System.out.println("String after removing duplicates: " + removeDuplicates(inputString));   
	
	//Friends Pairing
	System.out.println("Ways to pair friends: " + friendsPairing(3));

    // Test the binary strings problem
        int size = 3; // Size of the binary strings
        System.out.println("Binary strings of size " + size + " without consecutive 1s:");
        printBinStrings(size, 0, new StringBuilder());
 
    }
}