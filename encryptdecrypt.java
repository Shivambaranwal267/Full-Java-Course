
public class encryptdecrypt {
    public static void main(String[] args) {
        // encrypting the grade
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

    }

}
