import java.util.Scanner;

// k means how many rotates

public class KTimesRotatesArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array: ");
    int n = sc.nextInt();

    System.out.print("the array element are ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("how many rotates it takes ");
    int k = sc.nextInt();

    // k = k % arr.length;
    k = k % n;

    ReverseaPart(arr, 0, n - 1);
    ReverseaPart(arr, 0, k - 1);
    ReverseaPart(arr, k, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }

  public static void ReverseaPart(int arr[], int s, int e) {
    int start = s;
    int end = e;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
