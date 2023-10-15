import java.util.*;
// Best Time Complexity: O(n)
// Average Time Complexity: O(n^2)
// Worst Time Complexity: O(n^2)
// Best Space Complexity: O(1)
// Average Space Complexity: O(1)
// Worst Space Complexity: O(1)
// n is the length of the array
// Solution: Classic Bubble Sort :D
class Program {
  public static int[] bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      boolean sorted = true;
      for (int j = 1; j < n; j++) {
        if (array[j] < array[j - 1]) {
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
          sorted = false;
        }
      }
      if (sorted)
        break;
    }
    return array;
  }
}
