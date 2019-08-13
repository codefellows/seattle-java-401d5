package demo;


import java.awt.*;

public class Dog {
    // instance vars
    String name;
    String personalBarkNoise;
    int size;
    Color color;

    // constructor
    public Dog(String name, String personalBarkNoise, int size, Color color) {
        this.name = name;
        this.personalBarkNoise = personalBarkNoise;
        this.size = size;
        this.color = color;
    }

    public Dog() {}

    // instance methods
    public String toString() {
        return this.name + ", size " + this.size + ", says " + this.personalBarkNoise;
    }

    public void makeNoise() {
        System.out.println(this.personalBarkNoise);
    }
}
