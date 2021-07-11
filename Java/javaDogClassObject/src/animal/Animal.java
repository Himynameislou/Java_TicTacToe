package animal;

public abstract class Animal {
    //    Declare Fields
    private String breed;
    private int lifespan;
    private String behavior;
    private static String seller;

    public Animal(String breed, int lifespan, String behavior, double price) {
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    //Declaring getters & setters

    public static String getSeller() {
        return seller;
    }

    public static void setSeller(String seller) {
        Animal.seller = seller;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}
