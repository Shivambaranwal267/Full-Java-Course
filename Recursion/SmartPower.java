package Recursion;

import java.util.Scanner;

public class SmartPower {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = sc.nextInt();

    long ans = power(a, n);
    System.out.println(ans);

    sc.close();
  }

  //   public static long power(int a, int n) {
  //     // if (n == 1) {  // i.e --> 2 ^ 1 (a^n) is a that is 2
  //     //   return a;
  //     // }

  //     // if(n == 0) {   // i.e  --> 2^0 is 1.
  //     //     return 1;
  //     // }

  //     long temp = power(a, n - 1);
  //     return temp * a;

  //     // t.c is 0(n)

  //   }

  public static long power(int a, int n) {
    if (n == 1) {
      return a;
    }

    if(n < 0) {
      a = 1 / a;
      n = 1 * (-n);
    }

    long temp = power(a, n / 2);
    if (n % 2 == 0) { // even
      return temp * temp;
    } else { // odd
      return temp * temp * a;
    }
    // t.c is 0(2^N)

  }
}
