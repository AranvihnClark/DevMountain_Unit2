import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    // Step 1
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        // Step 2
        Scanner input = new Scanner(System.in);
        System.out.print("\nHello valued customer. Would you like to place an order? (Y/N)");

        String placeOrder = input.nextLine();;

        ArrayList<Object> order = new ArrayList<>();

        // Confirming user input.
        if (placeOrder.equalsIgnoreCase("y")) {

        } else if (placeOrder.equalsIgnoreCase("n")) {
            System.out.println("\nHave a nice day then.");
        } else {
            System.out.println("\nAs you do not seem to speak English, please leave and have a nice day.");
        }
    }
}
