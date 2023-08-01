import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of str
// Solution: Loop and Characters
class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    String caesar = "";
    for (int i = 0; i < str.length(); i++) {
      caesar += (char)((str.charAt(i) - 97 + key) % 26 + 97);
    }
    return caesar;
  }
}
