package lab1;

//R-1.10

public class Flower_R_10 {
    // Instance variables
    private String name;
    private int numberOfPetals;
    private float price;

    // Constructor to initialize instance variables
    public Flower_R_10(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for number of petals
    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    // Setter method for number of petals
    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    // Getter method for price
    public float getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(float price) {
        this.price = price;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Flower_R_10 object
        Flower_R_10 rose = new Flower_R_10("Rose", 32, 2.99f);

        // Testing the getter methods
        System.out.println("Flower Name: " + rose.getName());
        System.out.println("Number of Petals: " + rose.getNumberOfPetals());
        System.out.println("Price: " + rose.getPrice());

        // Testing the setter methods
        rose.setName("Lily");
        rose.setNumberOfPetals(6);
        rose.setPrice(1.99f);

        // Testing the getter methods again
        System.out.println("Updated Flower Name: " + rose.getName());
        System.out.println("Updated Number of Petals: " + rose.getNumberOfPetals());
        System.out.println("Updated Price: " + rose.getPrice());
    }
}
