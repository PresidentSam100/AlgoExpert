import java.util.*;
// Time Complexity: O(n * m)
// Space Complexity: O(n * m)
// n is the number of words
// m is the length of the longest word
// Solution: Set and List
class Program {
  public ArrayList<ArrayList<String>> semordnilap(String[] words) {
    Set<String> set = new HashSet<>();
    ArrayList<ArrayList<String>> ans = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      if (set.contains(words[i])) {
        ArrayList<String> pair = new ArrayList<>();
        pair.add(words[i]);
        pair.add(reverse(words[i]));
        ans.add(pair);
        set.remove(words[i]);
      } else {
        set.add(reverse(words[i]));
      }
    }
    return ans;
  }
  public static String reverse(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return sb.toString();
  }
}
