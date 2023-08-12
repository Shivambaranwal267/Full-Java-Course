// import java.util.*;

public class RevaPartOfArr {

  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    int[] arr = { -3, 4, 2, 8, 3, 9, 6, 2, 8, 10 };

    Reverse(arr);
    printArray(arr);
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void Reverse(int arr[]) {
    int s = 3;
    int e = 7;

    while (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;
      s++;
      e--;
    }
  }
}
