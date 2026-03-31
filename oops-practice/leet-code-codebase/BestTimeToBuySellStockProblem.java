import java.util.*;

public class BestTimeToBuySellStockProblem {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
