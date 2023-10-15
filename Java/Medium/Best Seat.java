import java.util.*;

class Program {
  public int bestSeat(int[] seats) {
    int index = -1;
    int left = 0;
    int right = 0;
    int space = 1;
    for (int i = 0; i < seats.length; i++) {
      if (seats[i] == 1) {
        left = right;
        right = i;
        if (right - left > space) {
          index = (right + left) / 2;
          space = right - left;
        }
      }
    }
    return index;
  }
}
