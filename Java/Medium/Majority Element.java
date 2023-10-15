import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the length of the array
// Solution: Subarray Majority Check and Repeat
class Program {
  public int majorityElement(int[] array) {
    int n = array.length;
    int count = 0;
    int num = array[0];
    for (int i = 0; i < n; i++) {
      if (count <= 0) {
        // Current subarray has no majority check new subarray
        num = array[i];
        count = 1;
      } else if (array[i] == num) {
        // Majority found
        count++;
      } else {
        // Majority not found
        count--;
      }
    }
    return num;
  }
}
