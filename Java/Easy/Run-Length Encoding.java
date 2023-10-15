import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the strings
// Solution: Loop and Characters
class Program {
  public String runLengthEncoding(String string) {
    StringBuilder ans = new StringBuilder();
    char curr = string.charAt(0);
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) != curr || count == 9) {
        ans.append(count);
        ans.append(curr);
        curr = string.charAt(i);
        count = 1;
      } else {
        count++;
      }
    }
    ans.append(count);
    ans.append(curr);
    return ans.toString();
  }
}
