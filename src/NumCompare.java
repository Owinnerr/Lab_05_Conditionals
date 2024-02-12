import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt the user for a number
        int num1; // Initialize num1 variable
        int num2; // Initialize num2 variable
        String trash1; // Intialize trash1 variable
        String trash2; // Initialize trash2 variable
        if (in.hasNextInt()) { // Condition: If it's safe to read in an int,
            num1 = in.nextInt(); // Reads an int value from the user
            System.out.print("Enter another number: "); // Prompts the user for another number
            if (in2.hasNextInt()) { // Condition: If it's safe to read in an int,
                num2 = in2.nextInt(); // Reads an int value from the user
                if (num1 == num2) { // Condition: If num1 and num2 are equal
                    System.out.println("The numbers " + num1 + " and " + num2 + " are equal."); // Output that both numbers are equal if the condition is true
                } else if (num1 < num2) { // If the above condition is false, then it moves to this condition: If num1 is less than num2,
                    System.out.println(num1 + " is less than " + num2); // Output that num1 is less than num2 if the condition is true
                } else if (num2 < num1) { // If the above conditions are false, then it moves to this condition: If num2 is less than num1,
                    System.out.println(num2 + " is less than " + num1); // Output that num2 is less than num1
                }
            } else {
                trash2 = in2.nextLine(); // Reads a string from the user
                System.out.println("You said number 2 was " + trash2 + ", which not a number."); // Outputs that the second input they entered is not a number
                System.out.println("Run the program again and enter a valid number."); // Outputs to run the program again
            }
        } else {
            trash1 = in.nextLine(); // Reads a string from the user
            System.out.println("You said number 1 was " + trash1 + ", which not a number."); // Outputs that the first input they entered is not a number
            System.out.println("Run the program again and enter a valid number."); // Outputs to run the program again
        }
    }
}
