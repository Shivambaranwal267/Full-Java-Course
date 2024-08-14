import java.util.Scanner;

class demo {
    double English, Maths, Evs, Yoga, IT;

    demo(double l, double m, double n, double o, double p) {
        English = l;
        Maths = m;
        Evs = n;
        Yoga = o;
        IT = p;

        double Total = (English + Maths + Evs + Yoga + IT);
        double percentage = Total * 100 / 500;
        System.out.println("Percentage is " + percentage);
    }
}

public class construct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English marks: ");
        double en = sc.nextDouble();

        System.out.println("Enter maths marks: ");
        double ma = sc.nextDouble();

        System.out.println("Enter Evs marks: ");
        double ev = sc.nextDouble();

        System.out.println("Enter Yoga marks: ");
        double yo = sc.nextDouble();

        System.out.println("Enter IT marks: ");
        double it = sc.nextDouble();

       demo obj = new demo(en, ma, ev, yo,it);

    }

}
