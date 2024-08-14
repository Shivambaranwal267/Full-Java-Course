import java.util.Scanner;

class shivam {
    String name, address, Sex;
    int phoneNumber;

    shivam(String n, String addr, String S, int phno) {
        name = n;
        address = addr;
        Sex = S;
        phoneNumber = phno;

        System.out.println("Student name is " + name);
        System.out.println("Address: " + addr);
        System.out.println("Sex: " + Sex);
        System.out.println("phoneNumber: " + phoneNumber);

    }
}

public class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Student Details ");

        System.out.print("Enter Name:");
        String name = sc.nextLine();

        System.out.print("Enter Address:");
        String address = sc.nextLine();

        System.out.print("Enter Sex (Male/Female):");
        String Sex = sc.nextLine();

        System.out.print("Enter Phone Number:");
        int phoneNumber = sc.nextInt();

        shivam student = new shivam(name, address, Sex, phoneNumber);

    }
}
