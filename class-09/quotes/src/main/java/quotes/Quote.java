package quotes;

public class Quote {
    String text;
    String author;

    public String toString() {
        return (this.text != null ? this.text : "") + " ~" + (this.author != null ? this.author : "");
    }
}
