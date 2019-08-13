package demo;

public class Pig {

    private static String[] thingsToFind = new String[]{"truffles", "tubers", "grubs", "copper"};
    public void makeNoise() {
        System.out.println("oink");
    }

    public void findThing() {
        if (Math.random() > 0.5) {
            // it found something! but what?
            System.out.println("The pig found " + thingsToFind[(int)(Math.random() * thingsToFind.length)]);
        } else {
            System.out.println("The pig found nothing");
        }
    }
}
