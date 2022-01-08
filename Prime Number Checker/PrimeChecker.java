import java.util.Scanner; //Importing scanner
import java.lang.Math; //Importing Math

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Welcome, this basic application will be able to output weather the number you entered is prime or not.");
        Scanner input = new Scanner(System.in); // Making an instance of the scanner class
        System.out.println("Please enter a number:"); // Asking the user to enter a number
        int userNumber = input.nextInt(); // Taking the user input

        // The code below will check if the number is prime or not
        boolean primeChecker = false;
        for (int c = 2; c*c <= userNumber / 2; c++) { // This loop will run until c is less or equal to the user number
        /* The reason for square rooting (c*c and dividing) is to optimize performance. 
         The square root will avoid the same number being multipled. Let say the computer does 
         7 * 8 = 56 but the computer will also do 8 * 7 which is just repetition. This can 
         affect the performance onces you have a large number.
         */
            // This condition checks does two things, it calculates the remainder and checks if it is equal to 0
            if (userNumber % c == 0) { 
                primeChecker = true; // If the condition is true, the boolean prime will be changed to true
                break;
            }
        }
        if (!primeChecker) {
            System.out.println(userNumber + " is prime");
        } else {
            System.out.println(userNumber + " is not prime");
        }
    }
}
