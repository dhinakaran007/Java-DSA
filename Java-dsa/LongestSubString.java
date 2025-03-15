import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }

    public static int longestSubString(String s) {
        int left = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right=0; right<s.length(); right++) {
            Character c = s.charAt(right);
            if(map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
