package datastructures;

public class LinkedList {
    Node head;

    protected LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
        this(null);
    }

    public LinkedList reverse() {
        Node previous = null;
        Node current = this.head;
        while(current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        this.head = previous;
        return this;
    }

    public boolean isPalindrome() {
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        for (Node current = head; current != null; current = current.next) {
            strings.add(0, current.value);
        }
        int length = strings.size();
        int i = 0;
        for (Node current = head; i < length / 2; current = current.next) {
            if (!current.value.equals(strings.remove(0))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
