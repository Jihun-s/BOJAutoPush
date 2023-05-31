import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 2;
        while(n != 1)
        {
            if(n%count==0){
                list.add(count);
                while(n%count ==0)
                {
                    n /= count;
                }
            }
            count++;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}