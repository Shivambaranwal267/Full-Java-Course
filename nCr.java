import java.util.Scanner;

public class nCr {

 // formula
//  nCr = n! / r! * (n - r)!


  public static int fact(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int num = fact(n);
    int den = fact(r) * fact(n - r);
    int result = num / den;

    System.out.println(result);
    sc.close();
  }
}
