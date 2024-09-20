// CoffeeDrink object class

public class CoffeeDrink {

    int numberOfCups;
    private String flavor; // private to one class: used for setting restrictions
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

    public CoffeeDrink(){
        numberOfCups = 1;
        flavor = "coffee";
        hasWhippedCream = false;
        //default coffee drink
    }
    public CoffeeDrink(int paramNumberOfCups){
        numberOfCups = paramNumberOfCups;
        flavor = "coffee";
        hasWhippedCream = false;
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

    //grabbing or getting method for flavor variable
    public String getFlavor(){
        return flavor; // you can return things between classes and use this method as a
        // substitute for flavor. now xx.getFlavor can work in other class.
        // giving user to see varibale but ot change it.
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor ; //set our class wide flavor to be equal to the parameter
    }
}
