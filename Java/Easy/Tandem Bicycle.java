import java.util.*;
// Time Complexity: O(nlog(n))
// Space Complexity: O(1)
// n is the number of red/blue shirt people
// Solution: Sort and Loop
class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    int n = redShirtSpeeds.length;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (fastest) {
        ans += Math.max(redShirtSpeeds[i], blueShirtSpeeds[n - i - 1]);
      } else {
        ans += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
      }
    }
    return ans;
  }
}
