import java.util.*;

public class fibbonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    int firstNum = 0;
    int SecNum = 1;
    System.out.print(firstNum + " " + SecNum + " ");

    for (int i = 1; i <= n; i++) {
      int nextNum = firstNum + SecNum;
      System.out.print(nextNum + " "); 
      firstNum = SecNum;
      SecNum = nextNum;
    }

    sc.close();
  }
}
