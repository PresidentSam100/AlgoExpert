import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the number of nodes in the LinkedList
// Solution: Slow and Fast Nodes
class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList middleNode(LinkedList linkedList) {
    LinkedList slow = linkedList;
    LinkedList fast = linkedList;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }
}
