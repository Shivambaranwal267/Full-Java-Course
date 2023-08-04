import java.util.*;

public class countfactorsFunc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = countfactors(n);
    System.out.print("The count of factors is " + result);

    sc.close();
  }

  public static int countfactors(int n) {
    int count = 0;
    for (int i = 1; i * i <= n; i++) { // n is sqrt(n)
      if (n % i == 0) {
        if (i != n / i) {
          count = count + 2;
        } else {
          count += 1;
        }
      }
    }
    return count;
  }
}
