// leetCode 62 Unique Paths
// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
// The test cases are generated so that the answer will be less than or equal to 2 * 109.

// Example 1:

// Input: m = 3, n = 7
// Output: 28
// Example 2:

// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down

import java.util.*;

public class Unique_Paths {

     public static void uniquePath(int m,int n){

          int[][] grid = new int[m][n];

          for(int i=0 ; i<m ; i++){
               for(int j=0 ; j<n ; j++){
                    if(i == 0 || j == 0){
                         grid[i][j] = 1;
                    } else {
                         grid[i][j] = grid[i][j-1] + grid[i-1][j];
                    }
               }
          }

          System.out.println("The total Way is : " + grid[m-1][n-1]);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number Of Row : ");
          int row = sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Number of Column : ");
          int column = sc.nextInt();
          sc.nextLine();

          uniquePath(row,column);
     }
}
