class Solution {
    public int solution(int n) {
        int answer = 0, val= 1, count = 1;
        while(val<=n){
            val = val * count;
            count++;
        }
        answer = count-2;
        return answer;
    }
}