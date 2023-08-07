import java.util.*;

class Program {
  public static int[] subarraySort(int[] array) {
    int n = array.length;
    int lo = Integer.MAX_VALUE;
    int hi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (i > 0 && array[i - 1] > array[i]) {
        lo = Math.min(lo, array[i]);
        hi = Math.max(hi, array[i]);
      }
      if (i < n - 1 && array[i] > array[i + 1]) {
        lo = Math.min(lo, array[i]);
        hi = Math.max(hi, array[i]);
      }
    }
    if (lo == Integer.MAX_VALUE && hi == Integer.MIN_VALUE) {
      return new int[]{-1, -1};
    }
    int left = 0;
    int right = n - 1;
    while (array[left] <= lo) {
      left++;
    }
    while (hi <= array[right]) {
      right--;
    }
    return new int[]{left, right};
  }
}
