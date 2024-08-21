import java.util.*;

interface demo {
    void student();

    void course();

    void details();
}

class abc implements demo {
    Scanner sc = new Scanner(System.in);
    String name, courname;
    int prNo;

    public void student() {
        System.out.println("Enter the name of the student: ");
        name = sc.next();
    }

    public void course() {
        System.out.println("enter the course ");
        courname = sc.next();

    }

    public void details() {
        System.out.println("Enter pr.No: ");
        prNo = sc.nextInt();
    }
}

class xyz extends abc {
    void print() {
        super.student();
        super.course();
        super.details();
        System.out.println("the name of the student" + name);
        System.out.println("the courname of the student" + courname);
        System.out.println("Prno is is " + prNo);

    }
}

public class college {
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.print();
    }

}
