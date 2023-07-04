class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        if(temp == 1){
            return 0;
        }
        while(temp != 1){
            if(answer>=500)
                return -1;
            //짝수일 때
            if(temp%2==0){
                temp /= 2;
                answer++;
                continue;
            }
            //홀수일 때
            else{
                temp = temp*3 +1;
                answer++;
                continue;
            }
        }
        return answer;
    }
}