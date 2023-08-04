import java.util.Scanner;

public class sumfuc {

  public static int sum(int n) {
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans += i;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    System.out.println(sum(n));
    sc.close();
  }
}
