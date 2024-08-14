import java.util.*;

interface abc{
    public void input();
    public void cal();
    public void  msg();
}


class xyz implements abc {
    Scanner scanner = new Scanner(System.in);
    int a,b, add,sub;


public void input() {
    System.out.println("Enter a No.: ");
    a = scanner.nextInt();

    System.out.println("Enter a No.: ");
    b= scanner.nextInt();
}

public void cal() {
    add = a + b;
    sub = a - b;
    System.out.println("Addition: "+add);
    System.out.println("Substraction: "+sub);
}

public void msg() {
    System.out.println("Hello World!");

}


}
public class inter {
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.input();
        obj.cal();
        obj.msg();
    }
}
