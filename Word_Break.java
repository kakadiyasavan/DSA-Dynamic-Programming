// leetCode 139 Word Break
// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
// Note that the same word in the dictionary may be reused multiple times in the segmentation.

// Example 1:

// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".
// Example 2:

// Input: s = "applepenapple", wordDict = ["apple","pen"]
// Output: true
// Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
// Note that you are allowed to reuse a dictionary word.
// Example 3:

// Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
// Output: false
 
import java.util.*;

public class Word_Break {

     public static void wordBreak(String s,List<String> wordDict){

          Set<String> wordSet = new HashSet<>(wordDict);

          int maxLen = 0;
          for(String word : wordDict)
               maxLen = Math.max(maxLen, word.length());

          int n = s.length();
          boolean[] dp = new boolean[n + 1];

          dp[0] = true;

          for(int i=1 ; i<=n ; i++){
               for(int j=i-1 ; j>=Math.max(0, i-maxLen) ; j--){
                    if(dp[j] && wordSet.contains(s.substring(j,i))) {
                         dp[i] = true;
                         break;
                    }
               }
          }
          System.out.println(dp[n]);
     }
   
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String : ");
          String str = sc.nextLine();

          System.out.println("Enter Number of Words in Dictionary : ");
          int n = sc.nextInt();
          sc.nextLine();

          List<String> wordDict = new ArrayList<>();

          System.out.println("Enter dictionary words : ");
          for(int i=0 ; i<n ; i++){
               wordDict.add(sc.nextLine());
          }
          wordBreak(str, wordDict);
     }
}
