import java.util.Scanner;

public class factorialfunc {

  public static int fact(int n) {
    int f = 1;

    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    int res = fact(n);
    System.out.println("the factorial of " + n + " is " + res);
    sc.close();
  }
}
