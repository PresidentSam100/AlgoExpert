import java.util.*;
// Average Time Complexity: O(log(n))
// Worst Time Complexity: O(n)
// Average Space Complexity: O(1)
// Worst Space Complexity: O(1)
// Solution: Search BST w/o Recursion
class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBstHelper(tree, target, tree.value);
  }

  public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
    BST curr = tree;
    while (curr != null) {
      // Current tree value is closer to target than current closest value
      if (Math.abs(curr.value - target) < Math.abs(closest - target)) {
        closest = curr.value;
      }
      if (target < curr.value) {
        // Search left child
        curr = curr.left;
      } else if (target > curr.value) {
        // Search right child
        curr = curr.right;
      } else {
        // Target found
        break;
      }
    }
    // Passed the end of tree. Closest value already found
    return closest;
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
