import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your birth month [1-12]: "); // Prompt the user for birth month
        int birthMonth; // Initialize birth month variable
        if (in.hasNextInt()) { // Condition: If it's safe to read in an int,
            birthMonth = in.nextInt(); // Reads an int value from the user
            if (birthMonth >= 1 && birthMonth <= 12) { // Condition: If birth month is greater than or equal to 1 AND less than or equal to 12,
                System.out.println("Your birth month is: " + birthMonth); // If the condition is true, output the users birth month
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth); // If the condition is false, output the users birth month and say it's not in range
            }
        }
    }
}