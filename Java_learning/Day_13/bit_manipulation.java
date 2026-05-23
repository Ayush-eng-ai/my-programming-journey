


/*
Bit manipulation is a technique used in programming to manipulate individual bits of data. It involves using bitwise operators to perform operations on binary representations of numbers. The common bitwise operators include:


1. AND (&): This operator performs a logical AND operation on each pair of corresponding bits.
2. OR (|): This operator performs a logical OR operation on each pair of corresponding bits.
3. XOR (^): This operator performs a logical exclusive OR operation on each pair of corresponding bits.
4. NOT (~): This operator performs a logical NOT operation on each bit, inverting its
value.
5. Left Shift (<<): This operator shifts the bits of a number to the left by
a specified number of positions, filling the rightmost bits with zeros.
6. Right Shift (>>): This operator shifts the bits of a number to the right by
a specified number of positions, filling the leftmost bits with the sign bit (for signed numbers) or zeros (for unsigned numbers).


Bit manipulation is often used in low-level programming, such as embedded systems, to optimize performance and memory usage. It can also be used in algorithms that require efficient data storage and manipulation, such as hashing and encryption.

*/
public class bit_manipulation {
    public static void main(String args[]) {
        System.out.println((5 & 6));
        System.out.println((5 | 6));
        System.out.println((5 ^ 6));
            System.out.println((~5));
            System.out.println((5 << 1));
            System.out.println((5 >> 1));   
    }
}


class BitManipulation {
// Check if a number is odd or even
    public static void oddOrEven(int n) {
            int bitMask = 1;
        if((n & bitMask) == 0) {
            // Even
            System.out.println("Even");

        } else {
            // Odd
            System.out.println("Odd");
        }
    }
// Get ith bit of a number
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;           

        }
    }

// Set ith bit of a number
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

// Clear ith bit of a number
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    
    }

// Update ith bit of a number
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }


        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
        
    }

// Clear last i bits of a number
    public static int clearLastIBits(int n, int i) {
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

// Clear range of bits from i to j
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int  bitMask = a|b;
        return n & bitMask;

    }

    public static void main(String args[]) {
        oddOrEven(5);
        oddOrEven(6);   
        System.out.println(getIthBit(5, 2));    
        System.out.println(setIthBit(5, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 1, 1));
        System.out.println(clearLastIBits(15, 2));
        System.out.println(clearRangeOfBits(31, 1, 3));

    }
}


// Question 2: Check if a number is a power of 2 or not
class PowerOfTwo {
    public static boolean isPowerofTwo(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;  

    }

    public static void main(String args[]) {
        System.out.println(isPowerofTwo(1));
        System.out.println(isPowerofTwo(2));
        System.out.println(isPowerofTwo(3));
        System.out.println(isPowerofTwo(4));
        System.out.println(isPowerofTwo(5));
        System.out.println(isPowerofTwo(8));
        System.out.println(isPowerofTwo(16));
    }

}


// Question 3: Count the number of set bits in a number
class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
        
            }
            n = n >> 1; 
        }
        return count;
    }


// Fast Exponentiation
    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(5));
        System.out.println(countSetBits(6));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(8));
        System.out.println(countSetBits(9));


        System.out.println(fastExponentiation(2, 5));
        
    }
}