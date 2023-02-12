public class Main {
    public static void main(String[] args) {
        //Declare Variables
        double price = 80;
        double shipping = 0;
        double total;

        //Conditionals and Operations

        if (price < 100)
        {
        shipping = price * .02;
        }

        total = price + shipping;

        //Output

        System.out.println("Your total price is " + total + " with a shipping cost of " + shipping);


    }
}