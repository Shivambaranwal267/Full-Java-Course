import java.util.Scanner;

public class numberpattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nst = 1;
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= nst; j++) {
        System.out.print(count + " ");
        count++;
      }
      nst++;
      System.out.println();
    }
    sc.close();
  }
}
