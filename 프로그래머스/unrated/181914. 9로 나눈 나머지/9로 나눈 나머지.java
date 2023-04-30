class Solution {
    public int solution(String number) {
        int answer = 0; String a = "";
        for(int i = 0; i<number.length();i++)
        {
            answer += number.charAt(i) - '0';
        }
        return answer = answer%9;
    }
}