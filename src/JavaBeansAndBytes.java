import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    String flavor;

    int randomInt;

    double randomNum;

    CoffeeDrink orderOne;

    CoffeeDrink orderTwo;

    CoffeeDrink orderThree;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2007;
        System.out.println("We were actually founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Iced Strawberry Matcha");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        orderOne = new CoffeeDrink(2, "Iced Mocha", true);
        orderTwo = new CoffeeDrink(1, "Espresso", false);
        orderThree = new CoffeeDrink(4, "Caramel Frap", true);
        // TODO
        // Print out the order details
        orderOne.printInfo();
        orderTwo.printInfo();
        orderThree.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        randomInt = (int)(Math.random()*31);
        System.out.println("You recieved a discount of " + randomInt + "%");

    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String paramflavor) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        flavor = paramflavor;
        System.out.println("Today's special is our tasty " + flavor + "!");

    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(int x = 1; x < 6; x++){
        System.out.println(x);
        }
        System.out.println("---");
        // Print 2, 5, 8, 11
        for(int x = 2; x < 12; x = x+3){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("---");
        // Print 8 to 0
        for(int x = 8; x >=0; x--){
            System.out.println(x);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        randomNum = Math.random();
        if(randomNum < 0.25){
            System.out.println("We recommend you try our Hot Cappuccino with Macadamia nut milk!");
        }
        if(randomNum >= 0.25 && randomNum < 0.5){
            System.out.println("We recommend you try our Iced Vanilla Latte with Caramel Syrup!");
        }
        if(randomNum >= 0.5 && randomNum < 0.75){
            System.out.println("We recommend you try our creamy Hot Chocolate!");
            }
        if (randomNum >= 0.75 && randomNum <1){
            System.out.println("We recommend you try our fresh Cold Brew!");
        }

    }
}

