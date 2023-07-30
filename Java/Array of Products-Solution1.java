import java.util.*;
// Time Complexity: O(n^2)
// Space Complexity: O(n)
// n is the length of the array
// Solution 1: Brute Force
class Program {
  public int[] arrayOfProducts(int[] array) {
    int n = array.length;
    int[] products = new int[n];
    Arrays.fill(products, 1);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          products[i] *= array[j];
        }
      }
    }
    return products;
  }
}
