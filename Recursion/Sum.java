package Recursion;

public class Sum {

  public static void main(String[] args) {
    int n = 5;
    int ans = sum(n);
    System.out.println(ans);
  }

  public static int sum(int N) {
    if (N == 1) {
      return 1;
    }
    int temp = sum(N - 1);

    return temp + N;
  }
}
