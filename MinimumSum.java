import java.util.Arrays;
import java.util.Scanner;

public class MinimumSum {

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

    long ans = MinPathSum(arr, m - 1, n - 1, dp);
    System.out.println(ans);
  }

  public static int MinPathSum(int[][] grid, int row, int col, int[][] dp) {
    
    if(row < 0 || col < 0) {
        return Integer.MAX_VALUE;
    }

    if(row == 0 && col == 0) {
        return grid[row][col];
    }

    if(dp[row][col] != -1) {
        return dp[row][col];
    }

    int down = MinPathSum(grid, row - 1, col, dp);
    int right = MinPathSum(grid, row , col - 1, dp);

    int ans = Math.min(down, right) + grid[row][col];
    
    dp[row][col] = ans;
    return ans;
  }
}


