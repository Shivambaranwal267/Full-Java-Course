import java.util.*;

public class MaxDifference4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (Math.abs(arr[i] - arr[j]) + i - j > max) {
          max = Math.abs(arr[i] - arr[j]) + i - j;
        }
      }
    }

    int ans1 = MaxDifference_2(arr);
    int ans2 = MaxDifference_3(arr);

    System.out.println(Math.max(ans1, ans2));

    sc.close();
  }

  public static int MaxDifference_2(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] += i;
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] - i;
    }

    return max - min;
  }

  public static int MaxDifference_3(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] -= i;
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + i;
    }

    return max - min;
  }
}
