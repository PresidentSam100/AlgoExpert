import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the length of the string
// Solution: Loop and Check
class Program {
  public static boolean isPalindrome(String str) {
    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
