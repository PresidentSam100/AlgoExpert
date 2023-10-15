import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the number of nodes in the Binary Tree
// Solution: Binary Tree leaves
class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sums = new ArrayList<>();
    // Start from root node and 0 sum
    branchSumsHelper(root, 0, sums);
    return sums;
  }

  public static void branchSumsHelper(BinaryTree root, int currSum, List<Integer> sums) {
    if (root == null) {
      return;
    }
    int newSum = currSum + root.value;
    // A leaf has been reached. Add branch sum to sums list.
    if (root.left == null & root.right == null) {
      sums.add(newSum);
      return;
    }
    // Check left and right children
    branchSumsHelper(root.left, newSum, sums);
    branchSumsHelper(root.right, newSum, sums);
  }
}
