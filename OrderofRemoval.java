import java.util.Arrays;
import java.util.Scanner;

public class OrderofRemoval {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(OrderofRemovalHelper(arr));

    sc.close();
  }

  public static int OrderofRemovalHelper(int[] arr) {
    int n = arr.length;
    Arrays.sort(arr);

    int ans = 0;

    for (int i = 0; i < n; i++) {
      int temp = arr[i] * (n - i);
      ans += temp;
    }

    return ans;
  }
}
