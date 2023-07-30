import java.util.*;
// Time Complexity: O(n^2)
// Space Complexity: O(n)
// n is the size of array
// Solution: Sort and Two Pointers
class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Sort the array
    Arrays.sort(array);
    List<Integer[]> list = new ArrayList<>();
    for (int m = 0; m < array.length - 2; m++) {
      int l = m + 1;
      int r = array.length - 1;
      while (l < r) {
        // Check if two pointers sum match targetSum
        if (array[l] + array[m] + array[r] < targetSum) {
          // Sum too small, find higher left pointer value
          l++;
        } else if (array[l] + array[m] + array[r] > targetSum) {
          // Sum too large, find smaller right pointer value
          r--;
        } else {
          // Sum found, return array of three number sum
          list.add(new Integer[]{array[m], array[l], array[r]});
          l++;
          r--;
        }
      }
    }
    return list;
  }
}
