import java.util.*;

public class sumofnaturalNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    System.out.println(n * (n + 1) / 2); // using formula Sn = n(n+1)/2

    sc.close();
  }
}
