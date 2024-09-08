// CoffeeDrink object class

public class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int paramnumberOfCups, String paramflavor, boolean paramhasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = paramnumberOfCups;
        flavor = paramflavor;
        hasWhippedCream = paramhasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        if(hasWhippedCream){
            System.out.println("You ordered " + numberOfCups + " cups of " + flavor + " coffee with whipped cream." );
        }
        else{
            System.out.println("You ordered " + numberOfCups + " cups of " + flavor + " coffee with no whipped cream.");
        }

    }
}
