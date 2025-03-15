import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println(result);
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(String s, int start, List<String> currentPartition, List<List<String>> result) {
        if(start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for(int i=start+1; i<=s.length(); i++) {
            String subString = s.substring(start, i);
            if(isPalindrome(subString)) {
                currentPartition.add(subString);
                backtrack(s, i, currentPartition, result);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
