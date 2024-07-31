import java.util.*;

public class strongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer ");
        int n = sc.nextInt();

        int temp = n;

        int f, i;
        int sum = 0;
        while (n != 0) {
            f = 1;
            i = 1;
            int lastdigit = n % 10;
            while (i <= lastdigit) {
                f = f * i;
                i = i + 1;
            }

            n = n / 10;
            sum = sum + f;
        }

        System.out.println("The sum is " + sum);
        if (sum == temp) {
            System.out.println(" strong number");
        } else {
            System.out.println("not a strong number");
        }

        sc.close();
    }
}
