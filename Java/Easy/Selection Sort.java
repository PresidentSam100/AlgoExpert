import java.util.*;
// Worst Time Complexity: O(n^2)
// Average Time Complexity: O(n^2)
// Best Time Complexity: O(n^2)
// Worst Space Complexity: O(1)
// Average Space Complexity: O(1)
// Best Space Complexity: O(1)
// n is the length of the array
// Solution: Classic Selection Sort :D
class Program {
  public static int[] selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int swap = array[i];
      int ind = i;
      for (int j = i; j < n; j++) {
        if (array[j] < swap) {
          ind = j;
          swap = array[ind];
        }
      }     
      array[ind] = array[i];
      array[i] = swap;
    }
    return array;
  }
}
