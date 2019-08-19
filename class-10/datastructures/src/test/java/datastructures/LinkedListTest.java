package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testIsPalindrome() {
        LinkedList list = new LinkedList(new Node("1",
                new Node("2", new Node("1", null))));
        assertTrue(list.isPalindrome());
    }

    @Test
    public void testIsPalindrome_evenLength() {
        LinkedList list = new LinkedList(new Node("1",
                new Node("2", new Node("2", new Node("1", null)))));
        assertTrue(list.isPalindrome());
    }

    @Test
    public void testIsPalindrome_nonPalindrome() {
        LinkedList list = new LinkedList(new Node("1",
                new Node("2", new Node("3", null))));
        assertFalse(list.isPalindrome());
    }
}