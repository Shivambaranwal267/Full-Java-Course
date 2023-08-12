import java.util.Scanner;

public class TwoSum {

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.println(twosum(arr, k));

    sc.close();

  }

  public static boolean twosum(int[] arr, int k) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == k) {
          return true;
        }
      }

    }
    return false;
  }
}





