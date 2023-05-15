import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<String>();
        int size = picture.length;
        for(String s:picture)
        {
            for(int q =0; q<k; q++)
            {
                String part = "";
                for(int i=0; i<s.length(); i++)
                {
                    for(int j =0; j<k; j++)
                    {
                        part += (String.valueOf(s.charAt(i)));
                    }
                }
            list.add(part);
            }
        }
        String[] answer = new String[list.size()];
        for(int i =0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}