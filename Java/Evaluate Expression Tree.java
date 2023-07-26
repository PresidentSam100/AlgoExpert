import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(h)
// n is the number of nodes in the Binary Tree
// h is the height of the Binary Tree
// Solution: Binary Tree Traversing
class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public int evaluateExpressionTree(BinaryTree tree) {
    // Leaf
    if (tree.value > 0) {
      return tree.value;
    }
    if (tree.value == -1) {
      // Addition
      return evaluateExpressionTree(tree.left) + evaluateExpressionTree(tree.right);
    } else if (tree.value == -2) {
      // Subtraction
      return evaluateExpressionTree(tree.left) - evaluateExpressionTree(tree.right);
    } else if (tree.value == -3) {
      // Division
      return evaluateExpressionTree(tree.left) / evaluateExpressionTree(tree.right);
    } else if (tree.value == -4) {
      // Multiplication
      return evaluateExpressionTree(tree.left) * evaluateExpressionTree(tree.right);
    }
    // Invalid expression tree
    return 0;
  }
}
