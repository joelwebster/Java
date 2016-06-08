import java.util.*;

public class StockTrading {

    public static void main(String[] args) throws Exception {
        int[] prices = { 7, 4, 3, 5, 3, 5, 7, 4, 2, 7, 5, 6, 9, 5, 4, 1 };
        System.out.println(maxProfit(prices));  // expectation: 7
    }

    /**
     * Given an array describing yesterday's prices over time of some stock,
     * find the max profit I could have made that day with a single trade of 1 share,
     * bearing in mind that I must buy before I can sell.
     */
    private static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 0;

        // Buy loop
        for (int i=0;i<prices.length-1;i++) {

            System.out.println(prices[i]);

            // Sell loop
            for (int j=0;j<prices.length;j++) {

                System.out.println(prices[j]);

                if ((prices[j]-prices[i]) > profit) {
                    profit = prices[j]-prices[i];

                    buy = prices[i];
                    sell = prices[j];
                }
            }
        }

        System.out.println("Buy at: " + buy);
        System.out.println("Sell at: " + sell);

        return profit;
    }
}