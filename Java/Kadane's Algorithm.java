import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the size of array
// Solution: Classic Kadane's Algorithm
class Program {
  public static int kadanesAlgorithm(int[] array) {
    int n = array.length;
    int max = Integer.MIN_VALUE;
    int curr = 0;
    for (int i = 0; i < n; i++) {
      curr += array[i];
      if (curr > max) {
        max = curr;
      }
      if (curr < 0) {
        curr = 0;
      }
    }
    return max;
  }
}
