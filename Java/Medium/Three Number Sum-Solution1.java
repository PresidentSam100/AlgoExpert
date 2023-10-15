import java.util.*;
// Time Complexity: O(n^3)
// Space Complexity: O(1)
// n is the size of array
// Solution: Triple Loop Brute Force
class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    List<Integer[]> list = new ArrayList<>();
    // Sort array
    Arrays.sort(array);
    int n = array.length;
    // Check all triples sums
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (array[i] + array[j] + array[k] == targetSum) {
            list.add(new Integer[]{array[i], array[j], array[k]});
          }
        }
      }
    }
    return list;
  }
}
