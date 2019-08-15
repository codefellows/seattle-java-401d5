package quotes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    Quote quote;
    Quote emptyQuote;
    @Before
    public void setUp() throws Exception {
        quote = new Quote();
        quote.author = "Michelle";
        quote.text = "Java is to Javascript as car is to carpet.";

        emptyQuote = new Quote();
    }

    @Test
    public void testToString() {
        assertEquals("quote should be text, followed by tilde, followed by author",
                "Java is to Javascript as car is to carpet. ~Michelle",
                quote.toString());
    }

    @Test
    public void testToString_emptyInstance() {
        assertEquals("empty quote should just give a space and a tilde",
                " ~",
                emptyQuote.toString());
    }
}