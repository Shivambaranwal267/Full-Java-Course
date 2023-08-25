import java.util.HashMap;
import java.util.Scanner;

public class PairSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    if (twoSum(arr, k) == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

  public static boolean twoSum(int arr[], int k) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int num : arr) {
      if (hm.containsKey(num) == true) {
        int temp = hm.get(num);
        hm.put(num, temp + 1);
      } else {
        hm.put(num, 1);
      }
    }

    for (int i = 0; i < arr.length; i++) {
      int a = arr[i];
      int b = k - a;

      if ((a != b) && (hm.containsKey(b) == true)) {
        return true;
      } else if ((a == b) && (hm.containsKey(b) == true) && (hm.get(b) > 1)) {
        return true;
      }
    }
    return false;
  }
}
