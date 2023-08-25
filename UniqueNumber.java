public class UniqueNumber {

  public static void main(String[] args) {
    int arr[] = { 6, 8, 8, 7, 7, 10, 6 };

    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans = ans ^ arr[i];
    }
    System.out.println(ans);
  }
}
