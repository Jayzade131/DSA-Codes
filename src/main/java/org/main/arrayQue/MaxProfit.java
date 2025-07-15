package org.main.arrayQue;

public class MaxProfit {
    public static void main(String[] args) {
       int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i]<minPrice)
            {
                minPrice=prices[i];

            }else {
                maxPrice=Math.max(maxPrice,prices[i]-minPrice);
            }

        }


        return maxPrice;

    }
}
