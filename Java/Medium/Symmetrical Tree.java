import java.util.*;

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

  public boolean symmetricalTree(BinaryTree tree) {
    return mirror(tree.left, tree.right);
  }

  public boolean mirror(BinaryTree left, BinaryTree right) {
    if (left != null && right != null && left.value == right.value) {
      return mirror(left.left, right.right) && mirror(left.right, right.left);
    }
    return left == right;
  }
}
