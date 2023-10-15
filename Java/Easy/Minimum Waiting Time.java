import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the size of queries array
// Solution: Sort and Arithmetic
class Program {

  public int minimumWaitingTime(int[] queries) {
    int[] sorted = queries.clone();
    Arrays.sort(sorted);
    int time = 0;
    int n = sorted.length;
    // Optimal to execute queries from shortest to longest
    for (int i = 0; i < n; i++) {
      time += sorted[i] * (n - i - 1);
    }
    return time;
  }
}
