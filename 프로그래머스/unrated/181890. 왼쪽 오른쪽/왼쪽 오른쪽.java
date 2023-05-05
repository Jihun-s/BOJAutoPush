import java.util.ArrayList;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<str_list.length; i++)
        {
            if(str_list[i].equals("l"))
            {
                answer = new String[i];
                for(int j = 0; j<i; j++)
                {
                    list.add(str_list[j]);
                }//l왼쪽
                for(int k = 0; k<list.size(); k++)
                {
                    answer[k] = list.get(k);
                }
                break;
            }//l일경우
            if(str_list[i].equals("r"))
            {
                answer = new String[str_list.length-i-1];
                for(int j = i+1; j<str_list.length; j++)
                {
                    list.add(str_list[j]);
                }//r오른쪽
                for(int k = 0; k<list.size(); k++)
                {
                    answer[k] = list.get(k);
                }
                break;
            }//r일경우
        }
        return answer;
    }
}