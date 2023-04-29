class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        if(0<=start&&start<=end&&end<=50)
        {
            for(int i = 0; i <= end-start; i++)
            {
                answer[i] = i+start;
            }
        }
        return answer;
    }
}