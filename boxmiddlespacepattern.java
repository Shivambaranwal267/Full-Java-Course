import java.util.Scanner;

public class boxmiddlespacepattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nstars = n / 2 + 1; // (n+2)/2
    int nspaces = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= nstars; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= nspaces; k++) {
        System.out.print(" ");
      }
      for (int l = 1; l <= nstars; l++) {
        System.out.print("*");
      }

      if (i <= n / 2) {
        nspaces += 2;
        nstars--;
      } else {
        nspaces -=2;
        nstars++;
      }
      System.out.println();
    }
    sc.close();
  }
}
