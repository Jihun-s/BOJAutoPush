import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        
        for (char a : c) {
            countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        }

        for (char a : c) {
            if (countMap.get(a) == 1) {
                answer += String.valueOf(a);
            }
        }
        
        return answer;
    }
}
