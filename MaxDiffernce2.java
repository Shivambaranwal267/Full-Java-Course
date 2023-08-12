import java.util.Scanner;

public class MaxDiffernce2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // for indexing plus i.e -- i
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] + i;
    }
    System.out.println(MaxDifference(arr));

    sc.close();
  }

  public static int MaxDifference(int arr[]) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    return max - min;
  }
}
