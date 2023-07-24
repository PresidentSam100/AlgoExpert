import java.util.*;
// Time Complexity: O(wh)
// Space Complexity: O(wh)
// w is the width of original matrix
// h is the height of original matrix
// Solution: Double Loop and Transpose Operation
class Program {
  public int[][] transposeMatrix(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    // Transpose matrix has width and height swapped
    int[][] transpose = new int[m][n];
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < m; c++) {
        // Transpose reflects original matrix across diagonal
        transpose[c][r] = matrix[r][c];
      }
    }
    return transpose;
  }
}
