import java.util.*;

class Program {
  public String[] commonCharacters(String[] strings) {
    ArrayList<Character> arr = new ArrayList<>();
    int len = Integer.MAX_VALUE;
    int ind = -1;
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() < len) {
        ind = i;
        len = strings[i].length();
      }
    }
    for (int i = 0; i < strings[ind].length(); i++) {
      if (!arr.contains(strings[ind].charAt(i))) {
        arr.add(strings[ind].charAt(i));
      }
    }
    for (int i = 0; i < strings.length; i++) {
      ArrayList<Character> temp = new ArrayList<>();
      for (int j = 0; j < strings[i].length(); j++) {
        temp.add(strings[i].charAt(j));
      }
      arr.removeIf(x -> !temp.contains(x));
    }
    String[] ans = new String[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
      ans[i] = "" + arr.get(i);
    }
    return ans;
  }
}
