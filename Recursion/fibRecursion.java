package Recursion;

public class fibRecursion {

  public static void main(String[] args) {
    int fib_len = 9;

    System.out.print("Fibonacci Series of " + fib_len + " numbers is: ");

    for (int i = 0; i < fib_len; i++) {
      System.out.print(fibonacci(i) + " ");
    }

  }

  public static int fibonacci(int n) {

    if(n == 0 || n == 1) {
        return n;
    }

    // if(n == 0) {
    //     return 0;
    // }

    // if (n == 1 || n == 2) {
    //   return 1;
    // }

    int temp1 = fibonacci(n - 1);
    int temp2 = fibonacci(n - 2);

    return temp1 + temp2;
  }
}
