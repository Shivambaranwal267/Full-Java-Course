import java.util.Scanner;

public class PrimeNumberFunc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 

    if(IsPrime(n)) {
        System.out.println("Prime Number");
    } else {
        System.out.println("Not Prime Number");
    }

    sc.close();
  }

  public static boolean IsPrime(int n) {
    if (n <= 1) {
      return false;
    }

    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

// u will solve using a count method also