package demo;

public class TherapyPig extends Pig implements ServiceAnimal {

    public void playPiano() {
        System.out.println("duh duh duuuuuuuuuh duh d-duh duh d-duh");
    }

    public void takeABow() {
        System.out.println("thank u very much");
    }

    // when this therapy pig is acting as a service animal,
    // this is what it means to be helpful
    @Override
    public void beHelpful() {
        this.playPiano();
        this.takeABow();
    }
}
