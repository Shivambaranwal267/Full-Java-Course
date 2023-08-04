import java.util.Scanner;

public class numberdiamondpattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nst = 1;
    int nsp = n / 2;

    int val = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < nsp; j++) {
        System.out.print("  ");
      }
      if (i <= n / 2) {
        val = i;
      } else {
        val = n + 1 - i;
      }
      for (int k = 0; k < nst; k++) {
        System.out.print(val + " ");

        if (k < nst / 2) {
          val++;
        } else {
          val--;
        }
      }

      if (i <= n / 2) {
        nsp--;
        nst = nst + 2;
      } else {
        nsp++;
        nst = nst - 2;
      }
      System.out.println();
    }
    sc.close();
  }
}
