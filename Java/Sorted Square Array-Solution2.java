import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// Solution 2: Two Pointer and Square
class Program {

  public int[] sortedSquaredArray(int[] array) {
    // New array to return
    int[] arraySquare = new int[array.length];
    // Left and right pointer
    int l = 0;
    int r = array.length - 1;
    int i = array.length - 1;
    while (l <= r) {
      // Compare absolute values of two pointer values
      if (Math.abs(array[l]) > Math.abs(array[r])) {
        // Left pointer has higher square
        arraySquare[i] = array[l] * array[l];
        l++;
      } else {
        // Right pointer has higher square
        arraySquare[i] = array[r] * array[r];
        r--;
      }
      // Decrement index of placement
      i--;
    }
    return arraySquare;
  }
}
