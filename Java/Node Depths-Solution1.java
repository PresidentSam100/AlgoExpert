import java.util.*;
// Average Time Complexity: O(n)
// Average Space Complexity: O(h)
// n is the number of nodes in the Binary Tree
// h is the height of the Binary Tree
// Solution: Stack of Nodes/Depths
class Program {

  public static int nodeDepths(BinaryTree root) {
    int ans = 0;
    Stack<BinaryTree> nodes = new Stack<>();
    Stack<Integer> depths = new Stack<>();
    // Start with root node
    nodes.push(root);
    depths.add(0);
    while (!nodes.isEmpty()) {
      BinaryTree node = nodes.pop();
      int depth = depths.pop();
      if (node == null) {
        continue;
      }
      // Depth of current node
      ans += depth;
      // Get children of current node
      nodes.push(node.left);
      nodes.push(node.right);
      depths.push(depth + 1);
      depths.push(depth + 1);
    }
    return ans;
  }
  
  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
