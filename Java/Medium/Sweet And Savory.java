import java.util.*;
// Time Complexity: O(nlogn)
// Space Complexity: O(1)
// n is the total number of dishes
// Solution: Sort and Two Pointers and Conditionals
class Program {
  public int[] sweetAndSavory(int[] dishes, int target) {
    // Sort dishes in ascending order
    Arrays.sort(dishes);
    // Two pointers for dish pairing
    int left = 0;
    int right = dishes.length - 1;
    int[] ans = {0, 0};
    int curr = Integer.MIN_VALUE;
    while (left < right) {
      // Dishes don't have opposite flavor profiles
      if (dishes[left] >= 0 || dishes[right] <= 0) {
        break;
      }
      int flavor = dishes[left] + dishes[right];
      if (flavor < target) {
        // New best target combined flavor profile
        if (curr < flavor) {
          ans = new int[]{dishes[left], dishes[right]};
          curr = flavor;
        }        
        // Check for less less sweet dish
        left++;
      } else if (flavor > target) {
        // Check for less savory flavor
        right--;
      } else {
        // Target combined flavor profile reached
        return new int[]{dishes[left], dishes[right]};
      }
    }
    return ans;
  }
}
