package Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Max {

    public static void main(String [] args) {

        //1st
        List<Double> num = Arrays.asList(10.0, 5.0, 2.0, 30.0, 44.0, 7.0);
        System.out.println(num.stream().max(Comparator.naturalOrder()));

        //2nd
        OptionalDouble db = DoubleStream.of(10.0, 5.0, 2.0, 30.0, 44.0, 7.0).max();
        System.out.println(db);

        //3rd
        List<Double> n = Arrays.asList(10.0, 5.0, 2.0, 30.0, 44.0, 7.0);
        System.out.println(n.stream().mapToDouble(a->a.doubleValue()).max());

    }
}
