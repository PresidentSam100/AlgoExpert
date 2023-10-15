import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the size of array
// Solution: Loop and Condition
class Program {
  public static boolean isMonotonic(int[] array) {
    boolean nonIncrease = true;
    boolean nonDecrease = true;
    for (int i = 1; i < array.length; i++) {
      // Check for non-increasing
      if (array[i - 1] > array[i]) {
        nonIncrease = false;
      }
      // Check for non-decreasing
      if (array[i - 1] < array[i]) {
        nonDecrease = false;
      }
    }
    return nonIncrease || nonDecrease;
  }
}
