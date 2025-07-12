// leetCode 509 Fibonacci Number
// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).

// Example 1:

// Input: n = 2
// Output: 1
// Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
// Example 2:

// Input: n = 3
// Output: 2
// Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
// Example 3:

// Input: n = 4
// Output: 3
// Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

import java.util.Scanner;

public class Fibonacci_Number {

     public static void Find_Fibonacci(int num){z

          int[] fibo = new int[num+1];
          fibo[0] = 0;
          fibo[1] = 1;

          for(int i=2 ; i<=num ; i++){
               fibo[i] = fibo[i-1]+fibo[i-2];
          }

          System.out.println("Fibonacci Number is : " + fibo[num]);
     }

     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number to Find Fibonacci : ");
          int num = sc.nextInt();
          sc.nextLine();

          Find_Fibonacci(num);
     }
}