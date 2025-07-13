// leetCode 70 Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

import java.util.*;

public class Climbing_Stairs {

     public static void Count_Climbing(int n){

          if(n<=3){
               System.out.println("Total Stairs Steps is : " + n);
               return;
          }

          int[] step = new int[n+1];
          step[0] = 1;
          step[1] = 2;
          step[2] = 3;
          
          for(int i=3 ; i<=n ; i++){
               step[i] = step[i-1]+step[i-2]; 
          }

          System.out.println("Total Stairs Steps is : " + step[n]);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of Stairs : ");
          int n = sc.nextInt();
          sc.nextLine();

          Count_Climbing(n);
     }
}
