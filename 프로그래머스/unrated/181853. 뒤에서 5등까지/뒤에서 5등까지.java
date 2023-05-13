import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        int n = 0;
        for(int i:num_list)
        {
            answer[n] = i;
            n++;
            if(n == 5)
            break;
        }
        return answer;
    }
}