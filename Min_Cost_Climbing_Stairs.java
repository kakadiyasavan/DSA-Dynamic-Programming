// leetCode 746 Min Cost Climbing Stairs
// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

// Example 1:

// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.
// Example 2:

// Input: cost = [1,100,1,1,1,100,1,1,100,1]
// Output: 6
// Explanation: You will start at index 0.
// - Pay 1 and climb two steps to reach index 2.
// - Pay 1 and climb two steps to reach index 4.
// - Pay 1 and climb two steps to reach index 6.
// - Pay 1 and climb one step to reach index 7.
// - Pay 1 and climb two steps to reach index 9.
// - Pay 1 and climb one step to reach the top.
// The total cost is 6.

import java.util.*;

public class Min_Cost_Climbing_Stairs {

     public static void Check_Cost(int[] nums){

          int n = nums.length;
          int[] cost = new int[n+1];
          cost[0] = 0;
          cost[1] = 0;

          for(int i=2 ; i<=n ; i++){
               cost[i] = Math.min((nums[i-1] + cost[i-1]),(nums[i-2]+cost[i-2]));
          }

          System.out.println("The Maximum Cost of Step : " + cost[n]);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Size of Array : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Number in Array : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          Check_Cost(nums);
     }
}
