import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: "); // Prompt the user for their age
        int age = in.nextInt(); // Store user data from prompt as an int variable
        if (age >= 21) { // Condition: If age is greater than or equal to 21,
            System.out.println("You get a wrist band."); // If the condition is true, output that the user gets a wrist band
        }
    }
}
