
import java.util.Arrays;
import java.util.Scanner;

public class goodIntegerDistinct {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(goodIntegerHelper(arr));

    sc.close();
  }

  public static int goodIntegerHelper(int[] arr) {

    Arrays.sort(arr);
    
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i) {
        count++;
      }
    }
    return count;
  }
}
