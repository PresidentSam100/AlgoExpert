import java.util.*;
// Time Complexity: O(nlogn)
// Space Complexity: O(1)
// n is the size of array
// Solution 3: Sort and Two Pointers
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Sort array
    Arrays.sort(array);
    // Left and right pointer
    int l = 0;
    int r = array.length - 1;
    while (l < r) {
      // Check if two pointers sum match targetSum
      if (array[l] + array[r] < targetSum) {
        // Sum too small, find higher left value
        l++;
      } else if (array[l] + array[r] > targetSum) {
        // Sum too large, find smaller right value
        r--;
      } else {
        // Sum found, return array of two number sum
        return new int[]{array[l], array[r]};
      }
    }
    // No such two number sum
    return new int[0];
  }
}
