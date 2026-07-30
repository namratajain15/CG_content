
// time complexity = O(n)

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {2,7,3,9,10};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("Maximum number : "+ max);
        System.out.println("Minimum number : "+ min);

    }
}
