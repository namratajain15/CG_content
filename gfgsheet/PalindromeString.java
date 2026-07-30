
//time complexity = O(n)

public class PalindromeString {

    public static void main(String[] args) {
        String s = "aba";

        StringBuilder str = new StringBuilder(s);
        str.reverse();

        if(s.equals(str.toString()))
            System.out.println("yes,palindrome");
        else
            System.out.println("No,palindrome");
    }
}

//-------another method-----------

//public class PalindromeString {
//    public static void main(String[] args) {
//        String str = "madam";
//        System.out.println(str + " is Palindrome? " + isPalindrome(str));
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

