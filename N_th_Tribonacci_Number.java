// leetCode 1137 N-th Tribonacci Number
// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.

// Example 1:

// Input: n = 4
// Output: 4
// Explanation:
// T_3 = 0 + 1 + 1 = 2
// T_4 = 1 + 1 + 2 = 4
// Example 2:

// Input: n = 25
// Output: 1389537

import java.util.*;

public class N_th_Tribonacci_Number {

     public static void Find_Tribonacci(int num){

          if (num == 0 || num == 1 || num == 2) 
               System.out.println("Total Tribonacci : " + num);

          int a = 0;
          int b = 1;
          int c = 1;

          int result = 0;

          for(int i=3 ; i<=num ; i++){
               result = a+b+c;
               a = b;
               b = c;
               c = result;
          }

          System.out.println("Total Tribonacci : " + result);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number You Can Find Tribonacci : ");
          int num = sc.nextInt();
          sc.nextLine();

          Find_Tribonacci(num);
     }
}
