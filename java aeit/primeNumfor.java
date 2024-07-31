
import java.util.Scanner;

public class primeNumfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(n + " is prime Number");
        } else {
            System.out.println(n + " is not prime Number");
        }

        sc.close();
    }
}
