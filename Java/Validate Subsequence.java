import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// Solution: Loop and Check
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int j = 0;
    // Loop through entire array
    for (int i = 0; i < array.size(); i++) {
      // Check current index of sequence
      if (array.get(i) == sequence.get(j)) {
        j++;
        // Check if subsequence
        if (j == sequence.size()) {
          return true;
        }
      }
    }
    // No such subsequence
    return false;
  }
}
