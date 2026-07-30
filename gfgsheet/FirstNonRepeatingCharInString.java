public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First Non-Repeating Character: " + findFirstNonRepeating(str));
    }

    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256]; // ASCII character frequencies

        // Step 1: Store frequencies
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        // Step 2: Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '_'; // If no unique character found
    }
}

