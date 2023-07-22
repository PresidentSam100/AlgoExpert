import java.util.*;
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// n is the size of array
// Solution 1: Brute Force
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    int[] ans = new int[2];
    boolean work = false;
    // Check every possible pair in array
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        // Compare pair sum to target sum
        if (array[i] + array[j] == targetSum) {
          ans[0] = array[i];
          ans[1] = array[j];
          work = true;
          break;
        }
      }
      if (work)
        break;
    }
    // Pair sums up to target sum
    if (work)
      return ans;
    // No pair sums up to target sum
    return new int[0];
  }
}
