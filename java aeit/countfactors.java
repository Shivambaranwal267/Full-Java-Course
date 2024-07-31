import java.util.Scanner;

public class countfactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = countfactor(n);
        System.out.println(result);

    }

    public static int countfactor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count += 2;
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }
}
