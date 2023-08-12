import java.util.Scanner;

public class CountGreater {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    for (int index = 0; index < n; index++) {
      if (arr[index] > max) {
       max = arr[index];
      }
    }

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) {
        count++;
      }
    }


    System.out.println(n - count);

    sc.close();
  }
}
