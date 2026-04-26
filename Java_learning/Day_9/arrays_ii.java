package Day_9;

/* 
    Max Subarray Sum using Kadane's Algorithm
    Given an array of integers, find the contiguous subarray with the largest sum and return that

*/

public class arrays_ii {
    public static void printSubarrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        for(int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        printSubarrays(numbers);
    }
    
    
}
