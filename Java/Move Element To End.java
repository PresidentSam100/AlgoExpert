import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the size of array
// Solution: Two Pointers
class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int l = 0;
    int r = array.size() - 1;
    while (l < r) {
      if (array.get(r) == toMove) {
        r--;
        continue;
      }
      else if (array.get(l) == toMove) {
        // Swap elements of two pointers
        int temp = array.get(l);
        array.set(l, array.get(r));
        array.set(r, temp);
      }
      l++;
    }
    return array;
  }
}
