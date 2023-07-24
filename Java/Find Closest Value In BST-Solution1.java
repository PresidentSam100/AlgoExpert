import java.util.*;
// Average Time Complexity: O(log(n))
// Worst Time Complexity: O(n)
// Average Space Complexity: O(log(n))
// Worst Space Complexity: O(n)
// Solution: Search BST w/ Recursion
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

  public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
    // Passed the end of tree. Closest value already found
    if (tree == null) {
      return closest;
    }
    // Current tree value is closer to target than current closest value
    if (Math.abs(tree.value - target) < Math.abs(closest - target)) {      
      closest = tree.value;
    }
    if (target < tree.value) {
      // Search left child
      return findClosestValueInBstHelper(tree.left, target, closest);
    } else if (target > tree.value) {
      // Search right child
      return findClosestValueInBstHelper(tree.right, target, closest);
    } else {
      // Target found
      return closest;
    }
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
