package com.codefellows;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        HashTable ht = new HashTable(1024);
        ht.set("John", "Husband");
        ht.set("Cathy", "Boss");
        ht.set("Amanda", "The Real Boss");
        ht.set("Allie", "Kid");
        ht.set("Zach", "Kid");
        ht.set("Rosie", "Dog");
        ht.set("Justin", "Student");
        ht.set("Demi", "Dog");
        ht.set("Ovi", "Student");
        ht.set("Ben", "Student");
        ht.set("Khalil", "Student");
        ht.set("Michael", "Student");
        ht.set("Timea", "Student");
        ht.set("Jason", "Student");
//
        System.out.println( "Has Michael ... " + ht.has("Michael") );
        System.out.println( "Get Michael " + ht.get("Michael") );
        System.out.println( "Get John " + ht.get("John") );
        System.out.println( "Has Freddie ... " + ht.has("Freddie Mercury") );
    }

}
