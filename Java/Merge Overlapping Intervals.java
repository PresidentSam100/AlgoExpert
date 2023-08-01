import java.util.*;
// Time Complexity: O(nlog(n))
// Space Complexity: O(n)
// n is the length of the intervals array
// Solution: Sort and Interval Points
class Program {
  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    ArrayList<int[]> arr = new ArrayList<>();
    int start = intervals[0][0];
    int end = intervals[0][1];
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i][0] > end) {
        arr.add(new int[]{start, end});
        start = intervals[i][0];
        end = intervals[i][1];
      } else if (intervals[i][1] > end) {
        end = intervals[i][1];
      }
    }
    arr.add(new int[]{start, end});
    return arr.toArray(new int[arr.size()][]);
  }
}
