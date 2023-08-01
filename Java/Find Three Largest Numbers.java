import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the length of the array
// Solution: Loop and Condition
class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int a = Integer.MIN_VALUE;
    int b = Integer.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= c) {
        a = b;
        b = c;
        c = array[i];
      } else if (array[i] >= b) {
        a = b;
        b = array[i];
      } else if (array[i] >= a) {
        a = array[i];
      }
    }
    return new int[]{a, b, c};
  }
}
