import java.util.Scanner;

public class ValidPerfectSquares {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    int i = 1;
    int ans = 1;

    while (i * i <= num) {
      ans = i;
      i++;
    }

    if (ans * ans == num) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
    scn.close();
  }
}
