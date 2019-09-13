package com.codefellows;

public class HashTable {

    private Node[] map;

    public HashTable(int size) {
        map = new Node[size];
    }

    // hash()
    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for( int i = 0; i<letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    // set()
    public void set(String key, String value) {

        // set a var (int) of the hash(key)
        int hashKey = hash(key);

        System.out.println(key + " " + hashKey);

        // If map[hashvalue] is a thing ... do the linked list thing
        // Otherwise, just add the node.
        if( this.map[hashKey] == null ) {
            map[hashKey] = new Node(key, value);
        }
        else {
            Node temp = map[hashKey];
            map[hashKey] = new Node(key, value);
            map[hashKey].setNext(temp);
        }

    }

    // get()
    public String get(String key) {
        // hash the key (should give me the same thing)
        // if the hash table has that key, send back the value from the node.
        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            // Actually go through the list and check the actual value
            // (do as I said, not as I did)
            return map[hashKey].value;
        }

        return null;
    }

    // has()
    public boolean has(String key) {
        int hashKey = hash(key);
        // Actually go through the list and check the actual value
        // (do as I said, not as I did)
        return map[hashKey] != null;
    }

    // ohShit()

}
