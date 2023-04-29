class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num>=2&&num<=100&&n>=2&&n<=9)
        {
            if(num%n==0)
                answer=1;
        }
        return answer;
    }
}