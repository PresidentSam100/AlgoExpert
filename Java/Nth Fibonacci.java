import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(1)
// n is the nth fibonacci value
// Solution: Two variables and sum
class Program {
  public static int getNthFib(int n) {
    int a = 0;
    int b = 1;
    while (n >= 2) {
      n--;
      int c = a + b;
      a = b;
      b = c;
    }
    return a;
  }
}
