import java.util.Scanner;

public class SetBits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int k = sc.nextInt();

    int ans = n | (1 << k);

    System.out.println(ans);

    sc.close();
  }
}
