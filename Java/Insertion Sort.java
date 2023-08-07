import java.util.*;
// Worst Time Complexity: O(n^2)
// Average Time Complexity: O(n^2)
// Best Time Complexity: O(n)
// Worst Space Complexity: O(1)
// Average Space Complexity: O(1)
// Best Space Complexity: O(1)
// n is the length of the array
// Solution: Classic Insertion Sort :D
class Program {
  public static int[] insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int j = i;
      while (j > 0 && array[j] < array[j - 1]) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
        j--;
      }
    }
    return array;
  }
}
