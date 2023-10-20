import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the number of nodes in the LinkedList
// Solution: Index and Remove
class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    LinkedList first = head;
    LinkedList second = head;
    for (int i = 0; i < k; i++) {
      second = second.next;
    }
    if (second == null) {
      head.value = head.next.value;
      head.next = head.next.next;
      return;
    }
    while (second.next != null) {
      first = first.next;
      second = second.next;
    }
    first.next = first.next.next;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
