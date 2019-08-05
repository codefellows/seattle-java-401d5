public class Ginger {
    public static void main(String[] args) {
        System.out.println("Woof (translation: Hello)");
        System.out.println("Ginger is the cutest dog and we all miss her so much.");

        System.out.println(translateToDog("Hello Ginger from all of us"));
    }

    // Takes in a string and changes all the words randomly to "woof", "grrr", or "arf".
    // - break the long string into an array of strings on spaces
    // - for each word in the array
    //  - randomly pick a dog word
    //  - replace (or put into a new array)
    // - turn back into a single string and return

    // public static ReturnType methodName(DataType param1, DataType param2) {...}
    public static String translateToDog(String words) {
        String[] arrayOfWords = words.split(" ");
        String[] dogNoises = new String[arrayOfWords.length];
        String[] possibleDogNoises = new String[]{ "woof", "grrr", "arf" };

        for (int i = 0; i < arrayOfWords.length; i++) {
            String chosenDogNoise = possibleDogNoises[
                (int)Math.floor(Math.random() * possibleDogNoises.length)
            ];
            dogNoises[i] = chosenDogNoise;
        }
        return String.join(" ", dogNoises);
    }
}
