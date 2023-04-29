import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = l; i <= r; i++)
        {
            String numStr = Integer.toString(i);
            boolean isOnly05 = true;
            for (int j = 0; j < numStr.length(); j++)
            {
                char c = numStr.charAt(j);
                if (c != '0' && c != '5')
                {
                    isOnly05 = false;
                    break;
                }
            }
            if (isOnly05)
            {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        int[] noAnswer = new int[] {-1};
        if (list.size() == 0)
        {
            return noAnswer;
        }
        else
        {
            for (int i = 0; i < list.size(); i++)
            {
                answer[i] = list.get(i);
            }return answer;
        }
    }
}