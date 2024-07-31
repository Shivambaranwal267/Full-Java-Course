import java.util.Scanner;

public class evenandoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the element: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sume = 0;
        int sumO = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number at index " + i + ": " + arr[i]);
                sume += arr[i];
            } else {
                System.out.println("Odd number at index " + i + ": " + arr[i]);
                sumO += arr[i];
            }

        }

        System.out.println("Sum of even numbers: " + sume);
        System.out.println("Sum of odd numbers: " + sumO);
        sc.close();

    }

}
