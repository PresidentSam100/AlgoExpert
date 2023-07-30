import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the array
// Solution 3: Left and Right Calculations
class Program {
  public int[] arrayOfProducts(int[] array) {
    int n = array.length;
    int[] products = new int[n];
    // Left products
    int left = 1;
    for (int i = 0; i < n; i++) {
      products[i] = left;
      left *= array[i];
    }
    // Right products
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
      products[i] *= right;
      right *= array[i];
    }
    return products;
  }
}
