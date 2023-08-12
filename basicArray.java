import java.util.Scanner;

public class basicArray {

  public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };

    // System.out.println(arr[3]);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    // n is size of array
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // n is size of array
    for (int i = 0; i < n; i++) { // i <= n -1
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
