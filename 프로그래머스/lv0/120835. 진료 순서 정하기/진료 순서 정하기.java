import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : emergency) {
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int[] answer = new int[emergency.length];
        for(int i = 0; i<emergency.length; i++)
        {
            for(int j = 0; j<emergency.length; j++)
            if(emergency[i] == list.get(j))
            {
                answer[i] = j+1;
            }
        }
        return answer;
    }
}