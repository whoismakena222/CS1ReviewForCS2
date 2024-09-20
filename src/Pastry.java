public class Pastry {
    private String name;

    private int number;

    private boolean hasCoffee;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int number(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public boolean hasCoffee(){
        return hasCoffee;
    }
    public void setHasCoffee(boolean hasCoffee){
        this.hasCoffee = hasCoffee;
    }

    public Pastry(String paramName, int paramNumber, boolean paramHasCoffee){
        name = paramName;
        number = paramNumber;
        hasCoffee = paramHasCoffee;
    }

    public void printInfo(){
        if(hasCoffee){
            System.out.println("You ordered " + number + " " + name + " with coffee." );
        }
        else{
            System.out.println("You ordered " + number + " " +  name + " with no coffee.");
        }
    }
}

