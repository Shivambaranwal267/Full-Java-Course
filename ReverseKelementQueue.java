import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKelementQueue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < k; i++) {
      q.add(sc.nextInt());
    }

    q = modifyQueue(q, k);

    for (int i = 0; i < q.size(); i++) {
      System.out.println(q.remove());
    }
  }

  public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    q = new LinkedList<>();
    Stack<Integer> st = new Stack<>();

    int n = q.size();
    for (int i = 1; i <= k; i++) {
      int temp = q.remove();
      st.push(temp);
    }

    for (int i = 1; i <= k; i++) {
      int temp = st.pop();
      q.add(temp);
    }

    for (int i = 1; i <= n - k; i++) {
      int temp = q.remove();
      q.add(temp);
    }

    return q;
  }
}
