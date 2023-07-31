import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the number of characters in string
// Solution 2: Hash Mapping
class Program {
  public int firstNonRepeatingCharacter(String string) {
    Map<Character, Integer> map = new HashMap<>();
    int n = string.length();
    for (int i = 0; i < n; i++) {
      if (map.containsKey(string.charAt(i))) {
        map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
      } else {
        map.put(string.charAt(i), 1);
      }
    }
    for (int i = 0; i < n; i++) {
      // Non-repeating character
      if (map.get(string.charAt(i)) == 1) {
        return i;
      }
    }
    // No non-repeating character
    return -1;
  }
}
