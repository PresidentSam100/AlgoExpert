import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the length of the array
// Solution 2: Absolute Value Range
class Program {
  public int firstDuplicateValue(int[] array) {
    for (int i = 0; i < array.length; i++) {
      // Only works when values are 1...n
      if (array[Math.abs(array[i]) - 1] < 0)
        return Math.abs(array[i]);
      array[Math.abs(array[i]) - 1] *= -1;
    }
    return -1;
  }
}
