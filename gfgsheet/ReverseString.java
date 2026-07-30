import java.util.Arrays;

public class ReverseString {

    //time complexity = O(n)

    public static void main(String[] args) {

//=======================ReverseString====================
        String s = "Namrata";
        char[] ch = s.toCharArray();
        String str = "";

        for (int i = ch.length-1; i >=0; i--) {
            str += ch[i];
        }
        System.out.println(str.toCharArray());

//        ================ReverseCharArray================
        char[] c = {'N','a','m','r','a','t','a'};
        int l = 0;
        int h = c.length-1;
        char temp;

        while(l<h){
            temp = c[l];
            c[l++] = c[h];
            c[h--] = temp;
        }

        System.out.println(c);
        System.out.println(Arrays.toString(c));

        //----------------------ReverseString-----------
                String str1 = "Infosys";
                String reversed = reverseString(str1);
                System.out.println("Reversed String: " + reversed);



        }


    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
