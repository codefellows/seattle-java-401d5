package demo;

public class Unicorn {
    private String name;
    private String color;
    private boolean sparkles;

    public Unicorn(String name, String color, boolean sparkles) {
        this.name = name;
        this.color = color;
        this.sparkles = sparkles;
    }

    public void frolic() {
        System.out.println(this.name + " is frolicking");
    }

    public String toString() {
        return String.format(
                "A %s unicorn named %s, with%s sparkles",
                this.color,
                this.name,
                this.sparkles ? "" : "out"
        );
    }
}
