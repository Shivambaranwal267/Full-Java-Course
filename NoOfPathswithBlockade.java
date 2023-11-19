
import java.util.Arrays;
import java.util.Scanner;

public class NoOfPathswithBlockade {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int[][] arr = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    long[][] dp = new long[m][n];

    for (int i = 0; i < m; i++) {
      Arrays.fill(dp[i], -1);
    }

    long ans = pathshelper(arr, m - 1, n - 1, dp);
    System.out.println(ans);

    sc.close();
  }

  public static long pathshelper(int[][] arr, int sr, int sc, long[][] dp) {
    if (sr < 0 || sc < 0 || arr[sr][sc] == 0) {
      return 0;
    }

    if (sr == 0 && sc == 0) {
      return 1;
    }

    if (dp[sr][sc] != -1) {
      return dp[sr][sc];
    }

    long path1 = pathshelper(arr, sr - 1, sc, dp);
    long path2 = pathshelper(arr, sr, sc - 1, dp);

    dp[sr][sc] = path1 + path2;
    return path1 + path2;
  }
}
