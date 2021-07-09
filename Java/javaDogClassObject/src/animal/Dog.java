package animal;

public class Dog {
    //    Declare Fields
    private String breed;
    private int lifespan;
    private String behavior;
    private double price;

    //
    //Source from 2nd Video
    //Declare Constructor - Manual way first
    public Dog(String breed, int lifespan, String behavior, double price){
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;

    }


    //    Declare Methods
    public String getBreed(){
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
}
