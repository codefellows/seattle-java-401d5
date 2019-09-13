package com.codefellows;

public class Node {

    public String key;
    public String value;
    public Node next;

    public void setNext(Node node) { this.next = node; }
    public void setKey(String key) { this.key = key; }
    public void setValue(String value) { this.value = value; }

    public Node(String key, String value) {
        setKey(key);
        setValue(value);
    }

}
