import java.util.Scanner;

class emp {

    int id;
    String name, addr, Job_Position, gender;
    long PhoneNumber, salary;

    public void input(int id,
            String name, String addr, String Job_Position, String gender,
            long PhoneNumber, long salary) {

        this.id = id;
        this.name = name;
        this.addr = addr;
        this.PhoneNumber = PhoneNumber;
        this.Job_Position = Job_Position;
        this.gender = gender;
        this.salary = salary;

    }
}

class details extends emp {
    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        name = sc.next();

        System.out.println("Enter Employee Address: ");
        addr = sc.next();

        System.out.println("Enter Employee Phone Number: ");
        PhoneNumber = sc.nextLong();

        System.out.println("Enter Employee Job Position: ");
        Job_Position = sc.next();

        System.out.println("Enter Employee Gender: ");
        gender = sc.next();

        System.out.println("Enter Employee Salary: ");
        salary = sc.nextLong();

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + addr);
        System.out.println("Employee Phone Number: " + PhoneNumber);
        System.out.println("Employee Job Position: " + Job_Position);
        System.out.println("Employee Gender: " + gender);
        System.out.println("Employee Salary: " + salary);
    }

}

public class employee {
    public static void main(String[] args) {
        details e = new details();
        e.display();

    }
}
