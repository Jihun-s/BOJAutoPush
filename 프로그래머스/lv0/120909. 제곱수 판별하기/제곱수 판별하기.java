class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            if(i*i == n){
                answer = 1;
                break;
            }else if(i>=n/2){
                answer = 2;
                break;
            }
        }
        return answer;
    }
}