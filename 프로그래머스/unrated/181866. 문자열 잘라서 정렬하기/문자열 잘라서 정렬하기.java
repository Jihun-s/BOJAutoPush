import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {
        String[] s = myString.split("x");
        Arrays.sort(s);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
        list.removeIf(str -> str.trim().isEmpty());
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}