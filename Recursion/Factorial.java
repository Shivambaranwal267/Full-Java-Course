package Recursion;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int res = fact(n);
    System.out.println(res);

    sc.close();
  }

  public static int fact(int N) {
    if (N == 1) {
      return 1;
    }

    int temp = fact(N - 1);

    return temp * N;
  }
}
