package algorithms.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args) {

    }

    static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for(char c : s1.toCharArray()) {
            set.add(c);
        }
        for(char c : s2.toCharArray()) {
            if(set.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }
}
