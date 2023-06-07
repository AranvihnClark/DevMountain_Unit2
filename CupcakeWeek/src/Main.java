import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Project 1 - Start
        // Creates a new ArrayList for the cupcakeMenu, which is a list.
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

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
                System.out.println("You have set the price for the regular cupcake as $" + priceText);
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for cupcakes.
        cupcake.setPrice(Double.parseDouble(priceText));

        System.out.println("\nWe are deciding on the price for our red velvet cupcake. Here is the description:");

        // Printing out cupcake's description.
        redVelvet.type();

        // Grabbing user's price input for the red velvet cupcake.
        System.out.print("\nHow much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the red velvet cupcake as $" + priceText);
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for red velvet cupcakes.
        redVelvet.setPrice(Double.parseDouble(priceText));

        System.out.println("\nWe are deciding on the price for our chocolate cupcake. Here is the description:");

        // Printing out cupcake's description.
        chocolate.type();

        // Grabbing user's price input for the chocolate cupcake.
        System.out.print("\nHow much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the chocolate cupcake as $" + priceText);
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
        // Initializing the arraylist for our drinkMenu
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        // Creating our menu items.
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        // Start of pricing our water.
        System.out.println("\nWe are deciding on the price for our water. Here is the description: ");
        water.type();

        // Grabbing user's price input for the water drink.
        System.out.print("\nHow much would you like to charge for the water ? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double for water.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the water as $" + priceText);
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for the water drink.

        // Start of pricing our soda.
        System.out.println("\nWe are deciding on the price for our soda. Here is the description: ");
        soda.type();

        // Grabbing user's price input for the soda drink.
        System.out.print("\nHow much would you like to charge for the soda ? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double for water.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the soda as $" + priceText);
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for the milk drink.
        soda.setPrice(Double.parseDouble(priceText));

        // Start of pricing our drinks.
        System.out.println("\nWe are deciding on the price for our milk. Here is the description: ");
        milk.type();

        // Grabbing user's price input for the water drink.
        System.out.print("\nHow much would you like to charge for the milk ? (Input a numerical number taken to 2 decimal places) ");

        // Confirming what was inputted is usable and converting it to a usable double for water.
        while (true) {
            priceText = input.nextLine();
            try {
                price = Double.parseDouble(priceText);

                // If the parsing does not throw an error, this formats the double into a string that has only two decimal places.
                priceText = String.format("%.2f", price);
                System.out.println("You have set the price for the milk as $" + priceText);
                break;
            }

            // Since we are grabbing the price in a string, this is necessary to make sure we get an input that makes sense.
            catch (NumberFormatException n){
                System.out.print("\nYou entered value that isn't a proper price. Please try again: ");
            }
        }

        // Setting the price for the water drink.
        milk.setPrice(Double.parseDouble(priceText));

        // Adding drink objects to ArrayList.
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A fresh bottle of ice cold water.");
    }
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