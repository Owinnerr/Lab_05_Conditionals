import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your party affiliation [D, R, or I]: "); // Prompt the user for their party affiliation
        String partyAffiliation = in.nextLine(); // Store user data as a string variable
        partyAffiliation = partyAffiliation.toUpperCase(); // Convert the partyAffiliation variable to uppercase incase the user inputs as lowercase
        switch (partyAffiliation) { // Switch case for partyAffiliation variable
            case "D": // Case: The party affiliation is D
                System.out.println("You get a Democratic Donkey."); // Output democratic donkey
                break;
            case "R": // Case; The party affiliation is R
                System.out.println("You get a Republican Elephant."); // Output republican elephant
                break;
            case "I": // Case: The party affiliation is I
                System.out.println("You get an Independent Person."); // Output independent person
                break;
            default: // If all cases are false, then go to default case
                System.out.println("You are an Other."); // Output other
        }
    }
}
