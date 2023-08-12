import java.util.*;

class Program {
  public int[] missingNumbers(int[] nums) {
    int n = nums.length;
    boolean[] arr = new boolean[n + 2];
    for (int i = 0; i < n; i++) {
      arr[nums[i] - 1] = true;
    }
    int[] ans = new int[2];
    int ind = 0;
    for (int i = 0; i < n + 2; i++) {
      if (!arr[i]) {
        ans[ind] = i + 1;
        ind++;
      }
    }
    return ans;
  }
}
