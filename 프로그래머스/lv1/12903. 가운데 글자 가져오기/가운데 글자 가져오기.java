class Solution {
    public String solution(String s) {
        int n = s.length();
        String answer = "";
        //s가 홀수일 때
        if(n%2==1){
            answer = s.substring(n/2, n/2+1);
        }
        //s가 짝수일 때
        else{
            answer = s.substring(n/2-1, n/2+1);
        }
        return answer;
    }
}