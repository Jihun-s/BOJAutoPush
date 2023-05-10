import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] abc = {"a", "b", "c"};
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> ans = new ArrayList<String>();
        list.add(myStr);
        
        for(String s:abc)
        {
            ArrayList<String> temp = new ArrayList<String>();
            for (String r : list)
            {
                String[] str = r.split(s);
                temp.addAll(Arrays.asList(str));
            }
            list = temp;
        }
        for(String s:list)
        {
            if(!s.isEmpty())
            {
                ans.add(s);
            }
        }
        if(ans.size() == 0)
        {
            ans.add("EMPTY");
        }
        String[] answer = new String[ans.size()];
        int n = 0;
        for(String s:ans)
        {
            answer[n] = s;
            n++;
        }
        return answer;
    }
}