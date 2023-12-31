import java.util.*;
// Time Complexity: O(nm)
// Space Complexity: O(nm)
// n is the number of rows in array
// m is the number of columns in array
// Solution: Logic No Recursion
class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    int n = array.length;
    int m = array[0].length;
    int top = 0;
    int right = m - 1;
    int bottom = n - 1;
    int left = 0;
    List<Integer> spiral = new ArrayList<>();
    while (spiral.size() < n * m) {
      // Go right
      for (int i = left; i <= right; i++) {
        spiral.add(array[top][i]);
      }
      top++;
      if (spiral.size() == n * m) {
        break;
      }
      // Go down
      for (int i = top; i <= bottom; i++) {
        spiral.add(array[i][right]);
      }
      right--;
      if (spiral.size() == n * m) {
        break;
      }
      // Go left
      for (int i = right; i >= left; i--) {
        spiral.add(array[bottom][i]);
      }
      bottom--;
      if (spiral.size() == n * m) {
        break;
      }
      // Go up
      for (int i = bottom; i >= top; i--) {
        spiral.add(array[i][left]);
      }
      left++;
      if (spiral.size() == n * m) {
        break;
      }
    }
    return spiral;
  }
}
