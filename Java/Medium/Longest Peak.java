import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the length of the array
// Solution: Find and Condition
class Program {
  public static int longestPeak(int[] array) {
    int ans = 0;
    for (int i = 1; i < array.length - 1; i++) {
      // Find peak
      if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
        int l = i - 1;
        int r = i + 1;
        // Find left bound
        while (l >= 0 && array[l + 1] > array[l]) {
          l--;
        }
        // Find right bound
        while (r < array.length && array[r - 1] > array[r]) {
          r++;
        }
        // Set longest peak
        ans = Math.max(ans, r - l - 1);
      }
    }
    return ans;
  }
}
