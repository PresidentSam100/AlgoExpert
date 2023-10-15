import java.util.*;
// Time Complexity: O(n + m)
// Space Complexity: O(c)
// n is the number of characters
// m is the length of the document
// c is the number of unique characters in the characters string
// Solution: Add and Subtract Character Counts
class Program {
  public boolean generateDocument(String characters, String document) {
    HashMap<Character, Integer> chars = new HashMap<>();
    for (int i = 0; i < characters.length(); i++) {
      char c = characters.charAt(i);
      chars.put(c, chars.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < document.length(); i++) {
      char c = document.charAt(i);
      if (!chars.containsKey(c) || chars.get(c) == 0) {
        return false;
      }
      chars.put(c, chars.get(c) - 1);
    }
    return true;
  }
}
