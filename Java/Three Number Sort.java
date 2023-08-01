import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the size of array
// Solution: Loop and Swap
class Program {
  public int[] threeNumberSort(int[] array, int[] order) {
    int n = array.length;
    int index = 0;
    for (int i = 0; i < n; i++) {
      if (array[i] == order[0]) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
        index++;
      }
    }
    index = n - 1;
    for (int i = n - 1; i >= 0; i--) {
      if (array[i] == order[2]) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
        index--;
      }
    }
    return array;
  }
}
