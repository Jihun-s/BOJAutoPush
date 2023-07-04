class Solution {
    public long solution(int a, int b) {
        int min = a, max = b;
        long answer = 0;
        if(a==b)
            return a;
        if(a>b){
            min = b;
            max = a;
        }
        for(int i = min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}