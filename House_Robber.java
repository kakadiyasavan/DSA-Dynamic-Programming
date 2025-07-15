// leetCode 198 House Robber
// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Example 1:

// Input: nums = [1,2,3,1]c
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.

import java.util.*;

public class House_Robber {

     public static void Count_House(int[] nums){

          if(nums.length < 2){
               System.out.println("Total Loot is : " + nums[0]); 
          }

          int[] loot = new int[nums.length];

          loot[0] = nums[0];
          loot[1] = Math.max(nums[0],nums[1]);

          for(int i=2 ; i<nums.length ; i++){
               loot[i] = Math.max((loot[i-2] + nums[i]),loot[i-1]);
          }

          System.out.println("Total loot is : " + loot[nums.length-1]);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int nums[] = new int[size];

          System.out.println("Enter Number of House : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          Count_House(nums);
     }
}
