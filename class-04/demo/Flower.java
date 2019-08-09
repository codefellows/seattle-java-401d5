public class Flower {

    // class variables: a single piece of data for the entire class
    // the word "static" means that it's a class variable.
    // access using the name of the class, i.e.
    // Flower.acceptableHabitats
    static String[] acceptableHabitats = new String[]{"garden", "field", "meadow", "greenhouse"};

    // class methods: a method for the class as a whole, not one instance
    // since it's not called on an instance, there is no contextual this
    // called like:
    // Flower.getRandomHabitat()
    static String getRandomHabitat() {
        int randomIndex = (int) (Math.random() * Flower.acceptableHabitats.length);
        return Flower.acceptableHabitats[randomIndex];
    }

    // instance variables: what makes each instance unique
    String color;
    boolean hasThorns;
    short numPetals;

    // constructor: how to make a new instance of this class
    // constructor has the same name as the name of the class and "no" return type
    public Flower(String color, boolean hasThorns, short numPetals) {
        this.color = color;
        this.hasThorns = hasThorns;
        this.numPetals = numPetals;
    }

    // instance methods: methods that can be called on an instance & can use its instance variables in execution
    // instance methods don't have the word "static"
    public String toString() {
        return String.format("A %s Flower with %d petals", this.color, this.numPetals);
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return this.color;
    }
}
