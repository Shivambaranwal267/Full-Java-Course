import java.util.Scanner;

public class BuySellStock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int prices[] = new int[n];
    for (int i = 0; i < n; i++) {
      prices[i] = sc.nextInt();
    }

    int result = MaxProfit(prices);
    System.out.println(result);
    sc.close();
  }

  public static int MaxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    int n = prices.length;

    for (int i = 0; i < n; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
      }
    }

    return maxProfit;
  }
}
