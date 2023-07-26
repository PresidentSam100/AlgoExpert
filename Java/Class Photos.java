import java.util.*;
// Time Complexity: O(nlog(n)))
// Space Complexity: O(1)
// n is the number of red/blue shirt students
// Solution: Sort and Check
class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Sort from shortest to tallest
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    int n = redShirtHeights.size();
    int temp = 0;
    for (int i = 0; i < n; i++) {
      if (redShirtHeights.get(i) > blueShirtHeights.get(i)) {
        // Red shirts at back, blue shirts at front (potentially)
        temp++;
      } else if (redShirtHeights.get(i) < blueShirtHeights.get(i)) {
        // Red shirts at front, blue shirts at back (potentially)
        temp--;
      }
    }
    // Check if photo guidelines are met
    if (Math.abs(temp) == n) {
      return true;
    } else {
      return false;
    }
  }
}
