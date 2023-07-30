import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the array
// Solution 2: Left and Right Calculations
class Program {
  public int[] arrayOfProducts(int[] array) {
    int n = array.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int[] products = new int[n];
    Arrays.fill(left, 1);
    Arrays.fill(right, 1);
    // Left products
    for (int i = 1; i < n; i++) {
      left[i] = array[i - 1] * left[i - 1];
    }
    // Right products
    for (int i = n - 2; i >= 0; i--) {
      right[i] = array[i + 1] * right[i + 1];
    }
    // Products no division
    for (int i = 0; i < n; i++) {
      products[i] = left[i] * right[i];
    }
    return products;
  }
}
