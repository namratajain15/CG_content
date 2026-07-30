import java.sql.SQLOutput;
import java.util.Arrays;

import static java.lang.System.exit;

public class ShuffleString {

    public static boolean checkEqual(String s1, String s2, String sh){
        if(s1.length() + s2.length() != sh.length()){
            return false;
        }
        return true;
    }

    public static String sort(String s){
       char[] ch = s.toCharArray();
       Arrays.sort(ch);
       return Arrays.toString(ch);
    }

//    public static boolean checkFirstChar(String s1, String s2, String sh){
//        int j = 0;
//        int k = 0;
//        int i = 0;
//        if((s1.charAt(j)!= sh.charAt(i)) && (s2.charAt(k)) != sh.charAt(i)){
//            return false;
//        }
//        return true;
//    }

    public static boolean checkConcatString(String s1, String s2, String sh){
        if((s1+s2).equals(sh))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aaa";//abc
        String s2 = "baa";//cba
        String sh = "aabaaa";//abccba

        if(!checkEqual(s1,s2,sh)){
            System.out.println("No shuffle string1");
            exit(0);
        }

        s1 = sort(s1+s2);
        sh = sort(sh);

        if(s1.equals(sh)){
            System.out.println("Shuffle string");
        }
        else
            System.out.println("No Shuffle string");

//        if(!checkFirstChar(s1,s2,sh)){
//            System.out.println("No shuffle string2");
//            exit(0);
//        }

//        if(checkConcatString(s1,s2,sh)){
//            System.out.println("Shuffle string1");
//            exit(0);
//        }
//
//        int j = 0;
//        int i = 0;
//        int c = 0 ;
//
//        for(int k=0;k<sh.length();k++) {
//            if (i < s2.length() &&  (j < s1.length()) && s1.charAt(j) == sh.charAt(k) && s2.charAt(i) == sh.charAt(k)) {
//                if ((j+1 < s1.length()) && s1.charAt(j + 1) == sh.charAt(k + 1)) {
//                    j++;
//                    c++;
//                } else if (i+1 < s2.length() && s2.charAt(i + 1) == sh.charAt(k + 1)) {
//                    i++;
//                    c++;
//                }
//            }
//            else if (j < s1.length() && s1.charAt(j) == sh.charAt(k)) {
//                    j++;
//                    c++;
//            } else if (i < s2.length() && s2.charAt(i) == sh.charAt(k)) {
//                    i++;
//                    c++;
//            }
//            }
//
//        if(c == sh.length())
//        {
//            System.out.println("Shuffle string");
//        }
//        else
//            System.out.println("No Shuffle string");
//
    }
}
