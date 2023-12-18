import java.util.Scanner;

public class RainWaterTrapping {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int trappedWater = trap(arr);
    System.out.println(
      "The amount of water that can be trapped is: " + trappedWater
    );

    sc.close();
  }

  public static int trap(int[] arr) {
    int n = arr.length;

    int[] prefixmax = new int[n];
    int[] suffixmax = new int[n];

    prefixmax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefixmax[i] = Math.max(prefixmax[i - 1], arr[i]);
    }

    suffixmax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      suffixmax[i] = Math.max(suffixmax[i + 1], arr[i]);
    }

    int ans = 0;
    for (int i = 1; i < n; i++) {
      ans += Math.min(prefixmax[i], suffixmax[i]) - arr[i];
    }

    return ans;
  }
}
