class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] num = String.valueOf(n).toCharArray();
        for(char c:num)
        {
            answer += c - '0';
        }
        return answer;
    }
}