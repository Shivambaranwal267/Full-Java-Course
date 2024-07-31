import java.util.Scanner;

public class perfectNumforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                sum +=i;
            }
        }

        System.out.println("sum is " + sum);

        if (sum == n) {
            System.out.println(n + " is perfect Number");
        } else {
            System.out.println(n + " is not perfect Number");
        }

        sc.close();
    }
}
