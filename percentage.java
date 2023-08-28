
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float total = 0;
        System.out.println("welcome to the CBSE percentage maker:");
        System.out.print("enter the total marks in percantage(eg:-80, 100):-  ");
        int total_marks = input.nextInt();
        System.out.print("enter subject1:");
        float s1 = input.nextFloat();
        total = total + s1;
        System.out.print("enter subject2:");
        float s2 = input.nextFloat();
        total = total + s2;
        System.out.print("enter subject3:");
        float s3 = input.nextFloat();
        total = total + s3;
        System.out.print("enter subject4:");
        float s4 = input.nextFloat();
        total = total + s4;
        System.out.print("enter subject5:");
        float s5 = input.nextFloat();
        total = total + s5;
        float fulltotal = total * 100 / 500;
        System.out.print("your total percentage:" + fulltotal + "%");
    }
}
