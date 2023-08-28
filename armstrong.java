public class armstrong {
    
        public static void main(String[] args) {
            int number = 371;
            int originalNumber, remainder, result = 0;
            int power = String.valueOf(number).length();
    
            originalNumber = number;
    
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, power);
                originalNumber /= 10;
            }
    
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
    

