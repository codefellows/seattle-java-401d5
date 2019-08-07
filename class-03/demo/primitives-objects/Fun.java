import java.util.Arrays;

public class Fun {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = x;
        System.out.println(String.format("x: %d, y: %d, z: %d", x, y, z));
        // x++;
        // System.out.println(String.format("x: %d, y: %d, z: %d", x, y, z));

        // String[] arr1 = new String[]{"apple", "banana", "cantaloupe"};
        // String[] arr2 = new String[]{"dragonfruit", "elderberry", "fig"};
        // System.out.println(String.format("arr1: %s, arr2: %s", Arrays.toString(arr1), Arrays.toString(arr2)));
        // String[] arr3 = arr1;
        // System.out.println(String.format("arr1: %s, arr2: %s, arr3: %s", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(arr3)));
        // arr1[0] = "apricot";
        // System.out.println(String.format("arr1: %s, arr2: %s, arr3: %s", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(arr3)));
    }
}
