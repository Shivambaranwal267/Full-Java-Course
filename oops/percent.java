import java.util.*;

class entry {
    int hra, tax, pf, da, ta, salary;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();

    }
}

class emp extends entry {
    void calculate() {
        super.input();
        ta = super.salary * 2 / 100;
        da = super.salary * 2 / 100;
        pf = super.salary * 2 / 100;
        hra = super.salary * 5 / 100;
        tax = super.salary * 5 / 100;

    }
}

class total extends emp {
    void tlt() {
        super.calculate();
        System.out.println("Total salary: " + super.salary);
        System.out.println("Total TA: " + super.ta);
        System.out.println("Total DA: " + super.da);
        System.out.println("Total HRA: " + super.hra);
        System.out.println("Total PF: " + super.pf);
        System.out.println("Total Tax: " + super.tax);
        int total = super.salary + super.ta + super.da + super.hra - (super.pf - super.tax);
        System.out.println("name is :"+name);
        System.out.println("Total Net Salary: " + total);
    }
}

public class percent {
    public static void main(String[] args) {

        total obj = new total();
        obj.tlt();
    }
}
