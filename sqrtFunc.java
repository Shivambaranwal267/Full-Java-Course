import java.util.Scanner;

public class sqrtFunc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(sqrt(n));
    
    sc.close();
  }

  public static int sqrt(int n) {
    int ans = 1;
    int i = 1;
    while (i * i <= n) {
      ans = i;
      i++;
    }
    return ans;
  }
}
