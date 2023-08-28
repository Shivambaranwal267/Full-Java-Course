import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the distance in kilometer:");
        float km = sc.nextFloat();
        System.out.println("miles=" + km * 0.621371);
        sc.close();

    }

}
