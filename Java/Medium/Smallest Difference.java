import java.util.*;
// Time Complexity: O(nlog(n) + mlog(m))
// Space Complexity: O(1)
// n is the size of arrayOne
// m is the size of arrayTwo
// Solution: Sort and Two Pointers
class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Sort both arrays
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    int l = 0;
    int r = 0;
    int[] ans = new int[2];
    int abs = Integer.MAX_VALUE;
    while (l < arrayOne.length && r < arrayTwo.length) {
      if (Math.abs(arrayOne[l] - arrayTwo[r]) < abs) {
        ans[0] = arrayOne[l];
        ans[1] = arrayTwo[r];
        abs = Math.abs(arrayOne[l] - arrayTwo[r]);
      }
      if (arrayOne[l] < arrayTwo[r]) {
        l++;
      } else {
        r++;
      }
    }
    return ans;
  }
}
