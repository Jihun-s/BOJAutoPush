class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number>=10&&number<=100&&n>=2&&n<=10)
        {
            if(number%n==0&&number%m==0)
            {
                answer=1;
            }
        }
        return answer;
    }
}