import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int swap = array[i];
      int ind = i;
      for (int j = i; j < n; j++) {
        if (array[j] < swap) {
          ind = j;
          swap = array[ind];
        }
      }     
      array[ind] = array[i];
      array[i] = swap;
    }
    return array;
  }
}
