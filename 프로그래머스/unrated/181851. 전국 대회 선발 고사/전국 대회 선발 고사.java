import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0;
        for(int i =0; i<rank.length; i++)
        {
            if(attendance[i])
            {
                list.add(rank[i]);
            }
        }
        int[] num = new int[list.size()];
        for(int i:list)
        {
            num[answer] = i;
            answer++;
        }
        answer = 0;
        Arrays.sort(num);
        for(int i =0; i<rank.length; i++)
        {
            if(rank[i] == num[0])
            {
                answer += 10000*i;
            }else if(rank[i] == num[1])
            {
                answer += 100*i;
            }else if(rank[i] == num[2])
            {
                answer += i;
            }
        }
        return answer;
    }
}