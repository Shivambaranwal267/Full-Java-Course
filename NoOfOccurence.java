import java.util.HashMap;
import java.util.Scanner;

public class NoOfOccurence {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int[] queries = new int[m];
    for (int i = 0; i < m; i++) {
      queries[i] = scn.nextInt();
    }

    PrintFrequency(arr, queries);

    scn.close();
  }

  public static void PrintFrequency(int arr[], int queries[]) {
    // brute force

    // for (int i = 0; i < M; i++) {
    //   int val = queries[i];
    //   int count = 0;
    //   for (int j = 0; j < N; j++) {
    //     if (arr[j] == val) {
    //       count++;
    //     }
    //   }
    //   System.out.print(count);
    // }

    // tc is o(n*m)

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int num : arr) {
      if (hm.containsKey(num) == true) {
        int temp = hm.get(num);
        hm.put(num, temp + 1);
      } else {
        hm.put(num, 1);
      }
    }

    for (int num : queries) {
      if (hm.containsKey(num) == true) {
        System.out.println(hm.get(num));
      } else {
        System.out.println(0);
      }
    }
    //   t.c is o(n+m)
  }
}
