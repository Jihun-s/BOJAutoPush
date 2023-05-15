import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        loop:
        for(int i:arr)
        {
            for(int j:delete_list)
            {
                if(i==j)
                {
                    continue loop;
                }
            }
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}