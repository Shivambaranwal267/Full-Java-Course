import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        // given number =8;
        System.out.print("enter a external number:");
        num = input.nextInt();
        System.out.println(num > 8);
        input.close();

    }

}
