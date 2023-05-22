class Solution {
    public int solution(int slice, int n) {
        int answer = 1, temp = slice;
        if(slice>=n)
        {
        }else{
            while(slice<n)
            {
                slice = temp;
                answer++;
                slice *= answer;
            }
        }
        return answer;
    }
}