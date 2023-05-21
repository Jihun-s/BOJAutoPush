class Solution {
    public int solution(int n) {
        int answer = 1;
        while(7*answer<n)
        {
            answer++;
        }
        return answer;
    }
}