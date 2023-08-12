import java.util.Scanner;

public class largestNumTwice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(dominantIndex(arr));

    sc.close();
  }

  public static int dominantIndex(int arr[]) {
    int Max = Integer.MIN_VALUE; // means (- infinity value)
    int SecondMax = Integer.MIN_VALUE;
    int index = -1;

    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] > Max) {
        SecondMax = Max;
        Max = arr[i];
        index = i;
      } else if (arr[i] > SecondMax) {
        SecondMax = arr[i];
      }
    }

    if (SecondMax * 2 <= Max) {
      return index;
    } else {
      return -1;
    }
  }
}
