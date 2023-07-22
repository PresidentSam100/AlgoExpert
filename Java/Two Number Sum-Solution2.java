import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the size of array
// Solution 2: Hashing
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> table = new HashSet<>();
    // Go through entire array
    for (int num : array) {
      // Check if num has matching pair in table
      if (table.contains(targetSum - num)) {
        return new int[]{num, targetSum - num};
      }
      else {
        // Add num to table if no pair exists
        table.add(num);
      }
    }
    // No such two number sum
    return new int[0];
  }
}
