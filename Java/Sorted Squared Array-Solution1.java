import java.util.*;
// Time Complexity: O(nlogn)
// Space Complexity: O(n)
// n is the size of array
// Solution 1: Square and Sort
class Program {

  public int[] sortedSquaredArray(int[] array) {
    // New array to return
    int[] arraySquare = new int[array.length];
    // Take square of every element in array and store it
    for (int i = 0; i < array.length; i++) {
      arraySquare[i] = array[i] * array[i];
    }
    // Sort array (accounts for negative values in original array)
    Arrays.sort(arraySquare);
    return arraySquare;
  }
}
