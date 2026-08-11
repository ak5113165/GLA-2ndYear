package DSAGLA;

public class LAB5 {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (ans < prices[i] - min) {
                ans = prices[i] - min;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        //Leetcode 121 buy sell stock.

    }
}
