import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the size of the array
// Solution: Binary Search Array Construction
class Program {
  public static BST minHeightBst(List<Integer> array) {
    return minHeightBst(array, 0, array.size() - 1);
  }

  public static BST minHeightBst(List<Integer> array, int lo, int hi) {
    if (lo > hi) {
      return null;
    }
    int mid = (lo + hi) / 2;
    // Binary Search Algorithm
    BST root = new BST(array.get(mid));
    root.left = minHeightBst(array, lo, mid - 1);
    root.right = minHeightBst(array, mid + 1, hi);
    return root;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
