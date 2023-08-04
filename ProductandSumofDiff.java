import java.util.Scanner;

public class ProductandSumofDiff {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n = sc.nextInt();

    System.out.println("The difference between the product and Sum of digit is " + prodandSum(n));

    sc.close();
  }

  public static int prodandSum(int n) {
    int sum = 0;
    int prod = 1;
    while (n != 0) {
      int lastdigit = n % 10;
      sum = sum + lastdigit;
      prod = prod * lastdigit;
      n = n / 10;
    }
    return prod - sum;
  }
}
