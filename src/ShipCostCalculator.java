import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of your item: "); // Prompting the user for price of item
        double priceOfItem; // Initialize price of item variable
        double shippingCost; // Initialize shipping cost variable
        double totalPrice; // Initialize total price variable
        if (in.hasNextDouble()) { // Condition: If it's safe to read in a double,
            priceOfItem = in.nextDouble(); // Reads a double value from the user
            if (priceOfItem >= 100) { // Condition: If the price of the item is greater than or equal to 100,
                shippingCost = 0; // If the condition is true, then the shipping cost is 0
            } else {
                shippingCost = 0.02 * priceOfItem; // If the condition is false, the shipping cost is 2% of the price (multiply by 0.02 because it's a double variable)
            }
            totalPrice = priceOfItem + shippingCost; // Set the total price variable to the sum of the original price and the shipping cost
            System.out.println("The shipping cost is: " + shippingCost); // Output shipping cost
            System.out.println("The total price is " + totalPrice); // Output total price (including shipping cost)
        }
    }
}