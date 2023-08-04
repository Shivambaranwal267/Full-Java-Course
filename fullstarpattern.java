import java.util.Scanner;

public class fullstarpattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nstar = 1;
    int nspaces = n / 2;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= nspaces; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= nstar; k++) {
        System.out.print("*");
      }

      if (i <= n / 2) {
        nspaces--;
        nstar = nstar + 2;
      } else {
        nspaces++;
        nstar = nstar - 2;
      }
      System.out.println();
    }
    sc.close();
  }
}
