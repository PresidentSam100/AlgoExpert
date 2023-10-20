import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the buildings array
// Solution: Simple Loop and Comparison
class Program {
  public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
    ArrayList<Integer> ans = new ArrayList<>();
    int height = 0;
    if (direction.equals("EAST")) {
      for (int i = buildings.length - 1; i >= 0; i--) {
        if (buildings[i] > height) {
          height = buildings[i];
          ans.add(0, i);
        }
      }
    } else if (direction.equals("WEST")) {
      for (int i = 0; i < buildings.length; i++) {
        if (buildings[i] > height) {
          height = buildings[i];
          ans.add(i);
        }
      }
    }
    return ans;
  }
}
