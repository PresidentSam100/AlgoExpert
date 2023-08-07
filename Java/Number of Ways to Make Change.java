import java.util.*;
// Time Complexity: O(nd)
// Space Complexity: O(n)
// n is the target amount
// d is the number of coin denominations
// Solution: Dynamic Programming
class Program {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    int[] dp = new int[n + 1];
    dp[0] = 1;
    int d = denoms.length;
    for (int j = 0; j < d; j++) {
      for (int i = 1; i <= n; i++) {
        if (i - denoms[j] >= 0) {
          dp[i] += dp[i - denoms[j]];
        }
      }
    }
    System.out.println(Arrays.toString(dp));
    return dp[n];
  }
}
