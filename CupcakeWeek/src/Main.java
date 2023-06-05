import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
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

        class RedVelvet extends Cupcake {
            @Override
            public void type() {
                System.out.println("A red velvet based cupcake, with cream cheese frosting.");
            }
        }

        class Chocolate extends Cupcake {
            @Override
            public void type() {
                System.out.println("A chocolate based cupcake, with chocolate frosting.");
            }
        }
    }
}
