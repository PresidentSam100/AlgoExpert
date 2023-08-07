import java.util.*;

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

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    LinkedList curr = linkedList;
    while (curr != null) {
      LinkedList next = curr.next;
      // Find next non-duplicate value
      while (next != null && next.value == curr.value) {
        next = next.next;
      }
      // Set next pointer to appropriate node
      curr.next = next;
      curr = next;
    }
    return linkedList;
  }
}
