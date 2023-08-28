public class FunctionCall {

  public static void main(String[] args) {
    int x = 10, y = 20;
    int temp1 = add(x, y);
    int temp2 = multiply(temp1, 30);
    int temp3 = sub(temp2, 75);

    System.out.println(temp3);
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int sub(int x, int y) {
    return x - y;
  }
}
