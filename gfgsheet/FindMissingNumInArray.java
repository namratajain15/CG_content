public class FindMissingNumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Missing Number: " + findMissing(arr, 6));
    }

    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

