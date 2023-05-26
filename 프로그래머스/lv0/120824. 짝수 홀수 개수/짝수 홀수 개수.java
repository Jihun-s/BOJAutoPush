class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0, even = 0;
        for(int i:num_list)
        {
            if(i%2==0)
            {
                even++;
            }else if(i%2==1)
                odd++;
        }
        int[] answer = {even, odd};
        return answer;
    }
}