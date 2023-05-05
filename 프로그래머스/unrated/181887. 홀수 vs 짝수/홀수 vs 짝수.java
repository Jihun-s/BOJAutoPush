class Solution {
    public int solution(int[] num_list) {
        int answer = 0,j = 0, k = 0;
        for(int i = 0; i<num_list.length; i++)
        {
            if(i%2 == 0)
            {
                j+=num_list[i];
            }else{
                k+=num_list[i];
            }
        }
        if(j>=k)
        {
            answer = j;
        }else answer = k;
        return answer;
    }
}