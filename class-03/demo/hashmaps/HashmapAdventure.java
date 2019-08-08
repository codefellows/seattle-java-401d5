import java.util.HashMap;

public class HashmapAdventure {
    public static void main(String[] args) {
        HashMap<String, Integer[]> animalFriendliness = new HashMap<>();
        animalFriendliness.put("Ginger", new Integer[]{11});
        animalFriendliness.put("that raccoon in my trash can", new Integer[]{0});
        animalFriendliness.put("all of the student", new Integer[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9});

        System.out.println(animalFriendliness.get("Ginger"));
    }

}