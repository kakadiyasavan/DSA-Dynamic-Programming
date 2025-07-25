// leetcode 121 Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

import java.util.*;

public class Best_Time_to_Buy_and_Sell_Stock {

     public static void maxProfit(int[] prices){
          int minPrice = Integer.MAX_VALUE;
          int maxProfit = 0;

          for(int price : prices){
               if(price < minPrice){
                    minPrice = price;
               } else {
                    int profit = price - minPrice;
                    maxProfit = Math.max(maxProfit, profit);
               }
          }

          System.out.println("Stock Selling Profit is : " + maxProfit);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Diffrent Day Stock Price : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          maxProfit(nums);
     }
}
