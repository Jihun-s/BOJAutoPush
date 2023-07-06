class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<signs.length; i++){
            int k = 1;
            if(signs[i]){
            }else k = -1;
            answer += absolutes[i] * k;
        }
        return answer;
    }
}