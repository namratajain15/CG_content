package Stream;
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String [] args) {
        List<Integer> num = Arrays.asList(10, 5, 2, 30, 44, 7);
        System.out.println(num.stream().filter(s->s%2==0).collect(Collectors.toList()));
    }
}
