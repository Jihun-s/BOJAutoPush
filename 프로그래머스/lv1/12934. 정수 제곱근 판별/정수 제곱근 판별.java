class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n+0.0);
        if((int)sqrt==sqrt){
            answer = (long)Math.pow(sqrt+1, 2);
        }else{
            return -1;
        }
        return answer;
    }
}