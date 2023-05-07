import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        for(String a:strArr)
        {
            if(!a.contains("ad"))
            {
                list.add(a);
            }
        }
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}