import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0, count = 0;
        for(int i = 0; i<score.length/m; i++){
            int min = Integer.MAX_VALUE;
            for(int j = score.length-1-count; j>score.length-1-m-count; j--){
                if(score[j]<min){
                    min = score[j];
                }
            }
            count += m;
            answer += (min * m);
        }
        return answer;
    }
}