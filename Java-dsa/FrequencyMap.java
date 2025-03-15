import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        String s = "FrequnecyMap";
        HashMap<Character, Integer> result = findFrequency(s);
        for(Map.Entry<Character, Integer> entrySet : result.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }

    public static HashMap<Character, Integer> findFrequency(String s) {
        HashMap<Character, Integer> result = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(char c : charArray) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}