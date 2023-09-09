import java.util.Scanner;

public class FloorBinarySearch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.println(Floor(arr, k));

    sc.close();
  }

  public static int Floor(int arr[], int k) {
    int lo = 0;
    int hi = arr.length - 1;
    int ans = Integer.MIN_VALUE;

    while (lo <= hi) {
      int m = (lo + hi) / 2;

      if (arr[m] == k) {
        return k;
      } else if (arr[m] < k) {
        ans = arr[m];
        lo = m + 1;
      } else {
        hi = m - 1;
      }
    }

    return ans;
  }
}
