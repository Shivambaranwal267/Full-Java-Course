import java.util.HashMap;
import java.util.Scanner;

public class firstNonRepeating {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(firNonrepeatElemet(arr));

    sc.close();
  }

  public static int firNonrepeatElemet(int arr[]) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int val : arr) {
      if (hm.containsKey(val) == true) {
        int temp = hm.get(val);
        hm.put(val, temp + 1);
      } else {
        hm.put(val, 1);
      }
    }

    for(int val:arr) {
        if(hm.get(val) == 1) {
            return val;

        }
    }

    return -1;   // If no non-repeating element is found
  }
}
