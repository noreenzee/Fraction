
package fraction;

import java.util.Scanner;


public class FractionTest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction[] myFracs = {
            new Fraction(12, 18),
            new Fraction(),
            new Fraction(125, 30),
            new Fraction(7, 3),
            new Fraction(49, 21)
        };

        while (true) {
            // Display menu options
            System.out.println("Choose an option:");
            System.out.println("1. Test the toString() method");
            System.out.println("2. Test the reduce() method");
            System.out.println("3. Test the toMixed() method");
            System.out.println("4. Test the getDecimal() method");
            System.out.println("5. Quit");

            // Read the user's choice
            int choice = -1; // default value to catch invalid input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer
            } else {
                scanner.nextLine(); // Clear the invalid input from the buffer
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue; // Skip the rest of the loop and ask again
            }

            // Handle each case based on user input
            switch (choice) {
                case 1:
                    for (Fraction frac : myFracs) {
                        System.out.println(frac.toString());
                    }
                    break;
                case 2:
                    for (Fraction frac : myFracs) {
                        frac.reduce();
                    }
                    break;
                case 3:
                    for (Fraction frac : myFracs) {
                        System.out.println(frac.toMixed());
                    }
                    break;
                case 4:
                    for (Fraction frac : myFracs) {
                        System.out.println(frac.getDecimal());
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
