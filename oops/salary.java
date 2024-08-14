import java.util.Scanner;

class demo {

    int hra, tax, pf, da, ta, salary;
    String name;

    demo(String na, int sal1) {

        name = na;
        salary = sal1;
        ta = salary * 2 / 100;
        da = salary * 2 / 100;
        pf = salary * 2 / 100;
        hra = salary * 5 / 100;
        tax = salary * 5 / 100;
        
        int total = (salary + ta + da + hra) - (pf - tax);
        System.out.println("Total net salary is " + total);

    }
}

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        demo obj = new demo(name, salary);

    }

}
