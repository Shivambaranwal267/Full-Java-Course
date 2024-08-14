import java.util.Scanner;

class demo {
    public void add() 
    {
        int a,b,c;
        System.out.println("Enter Two No.");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum="+c);
    }
    public void sub()
    {
        int a,b,c;
        System.out.println("Enter Two No.");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a-b;
        System.out.println("Sub="+c);
    }

    
}

public class objectclass

{
    public static void main(String[] args) {

        demo obj = new demo();
        obj.add();
        obj.sub();

    }

}
