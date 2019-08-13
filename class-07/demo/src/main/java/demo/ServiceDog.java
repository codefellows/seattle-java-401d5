package demo;


import java.awt.*;

public class ServiceDog extends Dog implements ServiceAnimal {

    // unique instance variables for a service dog
    String specialSkill;
    boolean canCarryStuff;

    // constructor
    public ServiceDog(String name, String personalBarkNoise, int size, Color color, String specialSkill) {
        super(name, personalBarkNoise, size, color);
        this.specialSkill = specialSkill;
    }

    public void beHelpful() {
        System.out.println(this.name + " is " + this.specialSkill);
    }

    public String toString() {
        return super.toString() + " while " + this.specialSkill;
    }

    public static ServiceDog fromDog(Dog d, String newSkill) {
        return new ServiceDog(d.name, d.personalBarkNoise, d.size, d.color, newSkill);
    }
}
