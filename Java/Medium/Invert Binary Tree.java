import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(d)
// n is the number of nodes in the Binary Tree
// d is the depth of the Binary Tree
// Solution: Swap and Child
class Program {
  public static void invertBinaryTree(BinaryTree tree) {
    if (tree != null) {
      BinaryTree temp = tree.left;
      tree.left = tree.right;
      tree.right = temp;
      invertBinaryTree(tree.left);
      invertBinaryTree(tree.right);
    }
  }

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}
