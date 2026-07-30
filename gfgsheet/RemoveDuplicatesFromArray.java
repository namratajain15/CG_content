import java.util.Arrays;
        import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        System.out.println("Array after removing duplicates: " + Arrays.toString(removeDuplicates(arr)));
    }

    public static Integer[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.toArray(new Integer[0]);
    }
}

