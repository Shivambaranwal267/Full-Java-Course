import java.util.*;

public class integerornot {
    public static void main(String[] args) {
        System.out.print("check the integer or not:");
        Scanner input = new Scanner(System.in);
        System.out.println(input.hasNextInt());
        input.close();
    }

}
