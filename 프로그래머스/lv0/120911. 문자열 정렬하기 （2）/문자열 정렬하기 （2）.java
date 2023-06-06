import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = String.valueOf(arr);
        return answer;
    }
}