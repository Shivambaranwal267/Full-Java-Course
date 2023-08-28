package Recursion;

import java.util.Scanner;

public class decreasing {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    dec(n);

    sc.close();
  }

  public static void dec(int N) {
    if (N == 1) {
      System.out.println(1 + " ");
      return;
    }
    System.out.println(N + " ");
    dec(N - 1);
  }
}
