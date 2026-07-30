package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_To_ListOfString {
    public static void main(String [] args){
        List<Integer> num = Arrays.asList(1,2,4,5,6,6);
        //type checking
        System.out.println(num.stream().map(Object::toString).collect(Collectors.toList()).getClass().getName());

        //printing
        System.out.println(num.stream().map(a->a.toString()).collect(Collectors.toList()));

    }
}
