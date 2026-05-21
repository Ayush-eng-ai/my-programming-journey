public class trapping_rainwater {
    public static int trap(int height[]) {
        // calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trap = 0;
        // loop
        for(int i = 0; i < height.length; i++) {

        // water level = min(left max boundary, right max boundary)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);

        // trapped water = water level - height[i]
        trap += waterLevel - height[i];
        }
        return trap;
    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6,  3, 2, 5};
        System.out.println("Trapped water: " +  trap(height));
    }
}


// Buy & Sell Stocks

class buySellStocks {
    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + maxProfit(prices)); 
    }
}
