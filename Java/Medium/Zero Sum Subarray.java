import java.util.*;

class Program {
  public boolean zeroSumSubarray(int[] nums) {
    int n = nums.length;
    Set<Integer> prefix = new HashSet<>();
    int prev = 0;
    for (int i = 0; i < n; i++) {
      if (prev + nums[i] == 0 || prefix.contains(prev + nums[i])) {
          return true;
      } else {
        prefix.add(prev + nums[i]);
        prev += nums[i];
      }
    }
    return false;
  }
}
