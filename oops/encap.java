
import java.util.*;

class demo {
    private int a;
    private String n ;
    private String p;

    public int getEmpa() {
        return a;
    }
    public String getName() {
        return n;
    }
    public String getEmpp() {
        return p;
    }

    public void setEmpa(int newValue) {
        a = newValue;
    }

    public void setName(String newValue) {
        n = newValue;
    } 
    
    public void setEmpp(String newValue) {
        p = newValue;
    }

}

public class encap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        demo obj = new demo();

        System.out.println("ENter ID: ");
        int m = sc.nextInt();

        System.out.println("Enter Name:");
        String n = sc.next();

        System.out.println("Enter Address: ");
        String addr = sc.next();

        obj.setEmpa(m);
        obj.setName(n);
        obj.setEmpp(addr);
        System.out.println("Emlpoyee ID: "+obj.getEmpa());
        System.out.println("Emlpoyee name: "+obj.getName());
        System.out.println("Emlpoyee address: "+obj.getEmpp());
    }
}
