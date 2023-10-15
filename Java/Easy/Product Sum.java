import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(d)
// n is the number of elements including nested elements
// d is the greatest depth of the nested elements
// Solution: Recursion
class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSumHelper(array, 1);
  }

  public static int productSumHelper(List<Object> array, int multiplier) {
    int sum = 0;
    for (Object arr : array) {
      if (arr instanceof ArrayList) {
        @SuppressWarnings("unchecked")
        ArrayList<Object> list = (ArrayList<Object>) arr;
        sum += productSumHelper(list, multiplier + 1);
      } else {
        sum += (int) arr;
      }
    }
    return sum * multiplier;
  }
}
