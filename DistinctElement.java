import java.util.HashSet;
import java.util.Scanner;

public class DistinctElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(countDistinct(arr));

    sc.close();
  }

  public static int countDistinct(int[] arr) {
    HashSet<Integer> hs = new HashSet<>();

    
    // for (int i = 0; i < arr.length; i++) {
    //     // add all the elements to the HashSet
    //     hs.add(arr[i]);
    // }

    for (int num : arr) {
      // add all the elements to the HashSet
      hs.add(num);
    }

    // return the size of hashset as
    // it consists of all Unique elements
    return hs.size();
  }
}
