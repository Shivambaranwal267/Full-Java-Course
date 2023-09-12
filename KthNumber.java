
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KthNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    System.out.println(kth(k));

    sc.close();
  }

  public static String kth(int k) {
    Queue<String> q = new LinkedList<>();
    q.add("1");
    q.add("2");

    String ans = "";
    for (int i = 0; i < k; i++) {
      String temp = q.remove();
      ans = temp;
      q.add(temp + "1");
      q.add(temp + "2");
    }

    return ans;
  }
}
