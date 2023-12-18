import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter the elements of the array: ");

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int[] RunningSumArray = RunningSum(arr);

    System.out.print("Running sum array: ");
    System.out.println(Arrays.toString(RunningSumArray));
    
    sc.close();
  }

  public static int[] RunningSum(int arr[]) {
    int n = arr.length;
    int[] pre = new int[n];
    pre[0] = arr[0];

    for (int i = 1; i < n; i++) {
      pre[i] = pre[i - 1] + arr[i];
    }

    return pre;
  }
}
