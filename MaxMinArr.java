import java.util.Scanner;

public class MaxMinArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Max(arr);
    Min(arr, n);

    sc.close();
  }

  public static void Max(int arr[]) {
    // int max = 0;
    int max = Integer.MIN_VALUE; // means (- infinity value)
    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("the maximum element of array is " + max);
  }

  public static void Min(int arr[], int size) {
    // int min = 0;
    int min = Integer.MAX_VALUE; // means (- infinity value)
    for (int i = 0; i <= size - 1; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("the maximum element of array is " + min);
  }
}
