import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(d)
// n is the number of nodes in the  BST
// d is the depth of the BST
// Solution: Binary Search Construct and Conditional
class Program {
  public static boolean validateBst(BST tree) {
    return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public static boolean validateBst(BST tree, int min, int max) {
    if (tree.value < min || tree.value >= max) {
      return false;
    }
    if (tree.left != null && !validateBst(tree.left, min, tree.value)) {
      return false;
    }
    if (tree.right != null && !validateBst(tree.right, tree.value, max)) {
      return false;
    }
    return true;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
