import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.println(isPresent(arr, k));
    sc.close();
  }

  public static boolean isPresent(int[] arr, int k) {
    
    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = s + e / 2;

      if (arr[m] == k) {
        return true;
      } else if (arr[m] < k) {
        s = m + 1;
      } else {   // (arr[m] > k)
        e = m - 1;
      }
    }

    return false;
  }
}
