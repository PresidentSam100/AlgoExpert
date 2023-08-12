import java.util.*;

class Program {
  public int[] missingNumbers(int[] nums) {
    int sum = 0;
    int n = nums.length;
    for (int i = 1; i <= n + 2; i++) {
      sum += i;
    }
    for (int i = 0; i < n; i++) {
      sum -= nums[i];
    }
    int avg = sum / 2;
    int lo = 0;
    int hi = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] <= avg) {
        lo += nums[i];
      } else {
        hi += nums[i];
      }
    }
    int first = 0;
    int second = 0;
    for (int i = 1; i <= avg; i++) {
      first += i;
    }
    for (int i = avg + 1; i <= n + 2; i++) {
      second += i;
    }
    return new int[]{first - lo, second - hi};
  }
}
