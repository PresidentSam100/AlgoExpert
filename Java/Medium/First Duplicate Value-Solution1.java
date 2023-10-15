import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the array
// Solution 1: Set Duplicates
class Program {
  public int firstDuplicateValue(int[] array) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
      if (set.contains(array[i])) {
        return array[i];
      }
      set.add(array[i]);
    }
    return -1;
  }
}
