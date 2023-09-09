import java.util.Scanner;

public class SingleElementBS {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(UniqueElement(arr));

    sc.close();
  }

  public static int UniqueElement(int[] arr) {
    if(arr.length == 1){
        return arr[0];
    }
    
    if(arr[0] != arr[1]){
        return arr[0];
    }

    int n = arr.length - 1;

    // 0 index
    // if (arr[0] == arr[1]) {
    //   return arr[0];
    // }

    // last index
    // if (arr[n - 1] != arr[n - 2]) {
    //   return arr[n - 1];
    // }

    int lo = 2;
    int hi = n - 3;

    while (lo < hi) {
      int mid = (lo + hi) / 2;

      if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
        return arr[mid];
      }

      if (arr[mid] == arr[mid - 1]) {
        mid--;
      }

      if (mid % 2 == 0) {
        lo = mid + 2;
      } else {
        hi = mid - 1;
      }
    }

    return arr[lo];
  }
}
