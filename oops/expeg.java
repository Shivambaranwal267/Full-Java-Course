import java.util.*;

public class expeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            int res = n1 / n2;
            System.out.println("res = " + res);
        } catch (Exception e) {
            System.out.println("Error: Divided by zero is not allowed" + e);
        }


    }
}
