public class GFG_LongestPallindrome {
    static class Solution{

        public static void main(String[] args){
            String str = "bananas";
            System.out.println(longestPalin(str));
        }
        static String longestPalin(String str) {

            if (str.length() <= 1)
                return str;

            String LPS = "";

            for (int i = 1; i < str.length(); i++) {

                // Consider odd length
                int low = i;
                int high = i;
                while(str.charAt(low) == str.charAt(high)) {
                    low--;
                    high++;

                    if (low == -1 || high == str.length())
                        break;
                }

                String palindrome = str.substring(low+1, high);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }

                // Consider even length
                low = i-1;
                high = i;
                while(str.charAt(low) == str.charAt(high)) {
                    low--;
                    high++;

                    if (low == -1 || high == str.length())
                        break;
                }

                palindrome = str.substring(low+1, high);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }
            }

            if(LPS.length()==1)
                return str.substring(0,1);
            else
                return LPS;
        }
    }
}
