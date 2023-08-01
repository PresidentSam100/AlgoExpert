import java.util.*;
// Time Complexity: O(nd)
// Space Complexity: O(n)
// n is the target amount
// d is the number of coin denominations
// Solution: Coin Dynamic Programming
class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      dp[i] = n + 1;
      for (int j = 0; j < denoms.length; j++) {
        if (denoms[j] <= i) {
          dp[i] = Math.min(dp[i], dp[i - denoms[j]] + 1);
        }
      }
    }
    return dp[n] == n + 1 ? -1 : dp[n];
  }
}
