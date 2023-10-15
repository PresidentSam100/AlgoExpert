import java.util.*;
// Time Complexity: O(log(n))
// Space Complexity: O(1)
// n is the length of the array
// Solution: Classic Binary Search :D
class Program {
  public static int binarySearch(int[] array, int target) {
    int lo = 0;
    int hi = array.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (array[mid] > target) {
        hi = mid - 1;
      } else if (array[mid] < target) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
