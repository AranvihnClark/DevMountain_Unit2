import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

        // Step 4
        boolean ordering = true;

        // Added for more realistic immersion of app.
        boolean ordered = false;

        while (ordering) {
            System.out.println("What would you like to order? Please use the number associated with each item to order.");
            try {
                int orderChoice = input.nextInt();

                // Regular cupcake
                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(1));
                    ordered = true;
                    System.out.println("\nItem added to order.");

                // Red velvet cupcake
                } else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(2));
                    ordered = true;
                    System.out.println("\nItem added to order.");

                // Chocolate cupcake
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(3));
                    ordered = true;
                    System.out.println("\nItem added to order.");

                // Water
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(1));
                    ordered = true;
                    System.out.println("\nItem added to order.");

                // Soda
                } else if (orderChoice == 5) {
                    order.add(drinkMenu.get(2));
                    ordered = true;
                    System.out.println("\nItem added to order.");

                // Milk
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(3));
                    ordered = true;
                    System.out.println("\nItem added to order.");
                } else {
                    System.out.println("\nPlease enter a number from above; we do not have your selected item on the menu.");
                }
            }
            catch (InputMismatchException i) {
                System.out.println("\nPlease enter only a number.");
            }

            System.out.print("\nWould you like to continue order? (Y/N)");

            placeOrder = input.nextLine();
            if (!placeOrder.equalsIgnoreCase("y") && ordered) {
                System.out.println("\nThank you for your order");
                ordering = false;

            // For when the customer didn't order anything and only window shopped.
            } else if (!placeOrder.equalsIgnoreCase("y") && !ordered){
                System.out.println("\nThank you for visiting us, and have a nice day,");
                ordering = false;
            }
        }
    }
}
