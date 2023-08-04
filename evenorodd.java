import java.util.Scanner;

public class evenorodd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the integer: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println(num + " is even no");
    } else {
      System.out.println(num + " is odd no");
    }
    sc.close();
  }
}
