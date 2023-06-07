import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    // Step 1
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        // Step 2
        Scanner input = new Scanner(System.in);
        System.out.print("\nHello valued customer. Would you like to place an order? (Y/N)");

        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<>();

        // Confirming user input.
        if (placeOrder.equalsIgnoreCase("y")) {
            // Step 3
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("Here is the menu:\n\tCupcakes:");

            int itemNumber = 0;

            for (Cupcake cupcake : cupcakeMenu) {
                itemNumber++;

                System.out.print(itemNumber + ": ");
                cupcake.type();

                System.out.print("Price: $" + cupcake.getPrice());

                System.out.println();
            }

            System.out.println("\tDrinks:");

            for (Drink drink : drinkMenu) {
                itemNumber++;

                System.out.print(itemNumber + ": ");
                drink.type();

                System.out.print("Price: $" + drink.getPrice());

                System.out.println();
            }
        } else if (placeOrder.equalsIgnoreCase("n")) {
            System.out.println("\nHave a nice day then.");
        } else {
            System.out.println("\nAs you do not seem to speak English, please leave and have a nice day.");
        }
    }
}
