import java.util.Scanner;

public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter a number: ");
        int n = sc.nextInt();

        int nstar = 1;
        int nspaces = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspaces; j++) {
                System.out.println();
            }
            
        }

        sc.close();

    }

}
