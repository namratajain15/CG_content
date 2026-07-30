public class RotationString {

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";

        s1 += s1;
        int j=0;
        int i=0;
        int c=0;
        int flag = 0;

        for(int k=0;k<s1.length();k++){
            if(s2.charAt(j)==s1.charAt(k)){
                j++;
                c++;
            }
            if(c==s2.length()){
                flag = 1;
                break;
        }
        }
        if(flag==1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
