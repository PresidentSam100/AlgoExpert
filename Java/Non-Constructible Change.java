import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Sort array of coins by value
    Arrays.sort(coins);
    // Store current total value of coins iterated through
    int total = 0;
    // Iterate over coins array
    for (int coin : coins) {
      // If we find a coin that is greater than total + 1 then we found minimum sum we can't create
      if (coin > total + 1) {
        return total + 1;
      }
      total += coin;
    }
    // All previous minimums were approachable
    return total + 1;
  }
}
