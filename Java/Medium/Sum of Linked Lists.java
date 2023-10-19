import java.util.*;
// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m))
// n is the length of the first LinkedList
// m is the length of the second LinkedList
// Solution: Continuous Iteration between Lists (like end of merge sort)
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

  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    LinkedList ans = new LinkedList(0);
    // Store the entire answer
    LinkedList temp = ans;
    int carry = 0;
    // Add through digits in both lists like regular addition
    while (linkedListOne != null && linkedListTwo != null) {
        int val = (linkedListOne.value + linkedListTwo.value + carry);
        carry = val / 10;
        temp.next = new LinkedList(val % 10);
        temp = temp.next;
        linkedListOne = linkedListOne.next;
        linkedListTwo = linkedListTwo.next;
    }
    // Add any remaining elements from first list
    while (linkedListOne != null) {
        int val = (linkedListOne.value + carry);
        carry = val / 10;
        temp.next = new LinkedList(val % 10);
        temp = temp.next;
        linkedListOne = linkedListOne.next;
    }
    // Add any remaining elements from second list
    while (linkedListTwo != null) {
        int val = (linkedListTwo.value + carry);
        carry = val / 10;
        temp.next = new LinkedList(val % 10);
        temp = temp.next;
        linkedListTwo = linkedListTwo.next;
    }
    // Add carry value if non-zero
    if (carry != 0) {
        temp.next = new LinkedList(carry);
    }
    return ans.next;
  }
}
