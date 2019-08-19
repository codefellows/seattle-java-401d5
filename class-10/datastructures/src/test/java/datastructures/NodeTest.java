package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void reverse() {
        Node originalHead = new Node ("1",
                new Node ("2", new Node("3",
                        new Node("4", new Node("5", new Node("6", null))))));
        LinkedList startingList = new LinkedList(originalHead);
        System.out.println(originalHead);
        LinkedList finalList = startingList.reverse();
        System.out.println(finalList.head);

    }
}