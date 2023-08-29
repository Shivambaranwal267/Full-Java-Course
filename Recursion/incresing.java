package Recursion;

import java.util.Scanner;

public class incresing {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    inc(n);

    sc.close();
  }

  public static void inc(int n) {
    if (n == 1) {
      System.out.print(1 + " ");
      return;
    }
    inc(n - 1);
    System.out.print(n + " ");
  }
}
