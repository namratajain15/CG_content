import java.util.HashMap;
import java.util.Map;

//time complexity = O(n)
//space complexity = O(n)

public class DuplicatesCharString {

    public static void main(String[] args) {

        String s = "abababdbabade";

        char[] ch = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (Character c : ch) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        System.out.println(map);
    }
}
