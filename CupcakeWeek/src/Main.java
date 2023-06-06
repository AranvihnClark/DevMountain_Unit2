import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Project 1 - Start
        // Creates a new ArrayList for the cupcakeMenu, which is a list.
        List<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // Object initialization for our ArrayList.
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        // Start of initializing the prices of each cupcake.
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        // Initializing scanner.
        Scanner input = new Scanner(System.in);

        System.out.println("\nWe are deciding on the price for our standard cupcake. Here is the description:");

        // Printing out cupcake's description.
        cupcake.type();

        // Grabbing user's price input for the ordinary cupcake.
        System.out.print("\nHow much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places) ");

        // Variables are put outside the while loop to be reused.
        String priceText;
        double price;

        // Confirming what was inputted is usable and converting it to a usable double.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the regular cupcake as $" + cupcake.getPrice());
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for cupcakes.
        cupcake.setPrice(Double.parseDouble(priceText));

        // Grabbing user's price input for the red velvet cupcake.
        System.out.print("\nHow much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the red velvet cupcake as $" + redVelvet.getPrice());
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for red velvet cupcakes.
        redVelvet.setPrice(Double.parseDouble(priceText));

        // Grabbing user's price input for the chocolate cupcake.
        System.out.print("\nHow much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the chocolate cupcake as $" + chocolate.getPrice());
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for red velvet cupcakes.
        chocolate.setPrice(Double.parseDouble(priceText));

        // Adding cupcake objects to ArrayList.
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        // Project 2 - Start
    }
}

// Cupcake class - the Parent class.
class Cupcake {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

// RedVelvet class - a child class of Cupcake.
class RedVelvet extends Cupcake {
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

// Chocolate class - a child class of Cupcake.
class Chocolate extends Cupcake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

// Drink class - Parent class.
class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A fresh bottle of ice cold water.");
    }

    // Soda class - a child class of Drink.
    class Soda extends Drink {
        @Override
        public void type() {
            System.out.println("A cold can of soda.");
        }
    }

    // Milk class - a child class of Drink.
    class Milk extends Drink {
        @Override
        public void type() {
            System.out.println("A fresh and cool bottle of milk.");
        }
    }
}