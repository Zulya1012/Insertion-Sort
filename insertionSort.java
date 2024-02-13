public class insertionSort {
  public static void main(String[] arg) {
    int[] arr = {
      22,
      10,
      23,
      26,
      20,
      32,
      14
    };
    for (int i = 1; i < arr.length; i++) {
      int cur = arr[i];
      int j = i - 1;
      while (j >= 0 && cur < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = cur;
    }
    for (int l: arr)
      System.out.println(l);
  }
}
