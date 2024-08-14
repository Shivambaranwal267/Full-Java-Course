import java.util.Scanner;

public class primearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        

        int count = 0;
        for (int i = 2; i < n; i++) {

            
            boolean isPrime = true;
            for (int j = 2; j <= i; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime) {
                    arr[count] = n;
                }
            }
        }

        for (int i = 2; i < count; i++) {
            System.out.println(" " + count);
        }

        sc.close();
    }

}