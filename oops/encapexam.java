import java.util.Scanner;

class demo {
    private String a;
    private long b;
    
    public String getName() {
      return a;
    }

    public long getsalary() {
        return b;
    }
    
    public void setName(String newValue) {
        a = newValue;
    }

    public void setSalary(long newValue) {
        b = newValue;
    }
}

public class encapexam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        demo obj = new demo();
        
        System.out.println("Enter Name:");
        obj.setName(sc.next());

        System.out.println("Enter Salary:");
        obj.setSalary(sc.nextLong());

        System.out.println("Name: " + obj.getName());
        System.out.println("Salary: " + obj.getsalary());
    }
}
