import java.util.*;

public class SumArr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("The Sum of Array Elements is " +Sum(arr, n));

    sc.close();
  }

  public static int Sum(int arr[], int n) {
    int ans = 0;
    for (int i = 0; i < n; i++) {
      ans = ans + arr[i];
    }
    return ans;
  }
}
