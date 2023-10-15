import java.util.*;
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// n is the number of characters in string
// Solution 1: Brute Force double loop
class Program {
  public int firstNonRepeatingCharacter(String string) {
    for (int i = 0; i < string.length(); i++) {
      boolean noRepeat = true;
      for (int j = 0; j < string.length(); j++) {
        if (i != j && string.charAt(i) == string.charAt(j)) {
          noRepeat = false;
        }
      }
      // Non-repeating character
      if (noRepeat) {
        return i;
      }
    }
    // No non-repeating character
    return -1;
  }
}
