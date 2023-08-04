import java.util.Scanner;

public class nPr {

  public static int fact(int n) {
    int ans = 1;

    for (int i = 1; i <= n; i++) {
      ans *= i;
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int num = fact(n);
    int den = fact(n - r);

    int result = num / den;
    System.out.println(result);
    sc.close();
  }
}
