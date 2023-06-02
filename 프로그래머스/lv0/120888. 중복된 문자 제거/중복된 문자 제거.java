import java.util.Set;
import java.util.LinkedHashSet;
class Solution {
    public String solution(String my_string) {
        Set<Character> c = new LinkedHashSet<>();
        for (char a : my_string.toCharArray()) {
            c.add(a);
        }
        StringBuilder sb = new StringBuilder();
        for (char a : c) {
            sb.append(a);
        }

        String answer = sb.toString();
        return answer;
    }
}