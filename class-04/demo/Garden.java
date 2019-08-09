public class Garden {
    public static void main(String[] args) {
        short s = 18;
        Flower rose = new Flower("red", true, s);
        Flower sunflower = new Flower("yellow", true, (short)8);
        System.out.println(rose);
        System.out.println(sunflower);
        sunflower.setColor("red");
        System.out.println(sunflower);
        sunflower.color = "chartreuse";
        System.out.println(sunflower.getColor());

        System.out.println("Our rose is in a " + Flower.getRandomHabitat());
    }
}
