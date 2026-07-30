package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_UpperCase {
    public static void main(String [] args){
        String s = "abcDhj";
        List <String> list = Arrays.asList("apple", "banana" , "mango");

        // String
        s= s.toUpperCase();
        System.out.println(s);

        // 1st
       System.out.println(list.stream().map(st->st.toUpperCase()).collect(Collectors.toList()));
        // 2nd
       System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));

    }
}
