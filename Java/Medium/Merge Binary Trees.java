import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(h)
// n is the number of nodes in the smaller Binary Tree
// h is the height of the shorter Binary Tree
// Solution: Merge and Traverse and Repeat
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

  public BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
    if (tree1 == null) {
      return tree2;
    }
    if (tree2 == null) {
      return tree1;
    }
    BinaryTree merge = new BinaryTree(tree1.value + tree2.value);
    merge.left = mergeBinaryTrees(tree1.left, tree2.left);
    merge.right = mergeBinaryTrees(tree1.right, tree2.right);
    return merge;
  }
}
