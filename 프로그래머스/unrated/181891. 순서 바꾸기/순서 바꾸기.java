import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = n; i<num_list.length; i++)
        {
            list.add(num_list[i]);
        }//n번쨰 이후 원소들
        for(int i = 0; i<n; i++)
        {
            list.add(num_list[i]);
        }//n번째 이하 원소들
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++)
        {
            answer[i] = list.get(i);   
        }
        return answer;
    }
}