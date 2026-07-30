public class LC_CountAndSay {
    class Solution {
        public String countAndSay(int n) {

            if(n==1)
                return "1";

            String s = "1";

            for(int i=1;i<n;i++){
                String str = "";
                s += "&";
                int c = 1;
                for(int j=1 ; j<s.length(); j++ ){
                    if(s.charAt(j-1)==s.charAt(j)){
                        c++;
                    }
                    else{
                        str += c;
                        str += s.charAt(j-1);
                        c = 1;
                    }
                }
                s = str;
            }
            return s;

        }
    }
}
