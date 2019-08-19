package datastructures;

public class Node {
    String value;
    Node next;

    public static Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        while(current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public Node reverse_rec(Node head) {
        return reverse(head, null);
    }
    private Node reverse (Node head, Node answerSoFar) {
        if (head == null) {
            return answerSoFar;
        } else {
            Node temp = head.next;
            head.next = answerSoFar;
            return reverse(temp, head);
        }
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        return String.format("%s -> %s", this.value, this.next == null ? "null" : this.next.toString());
    }
}
