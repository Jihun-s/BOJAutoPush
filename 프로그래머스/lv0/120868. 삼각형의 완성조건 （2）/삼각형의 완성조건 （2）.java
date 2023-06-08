class Solution {
    public int solution(int[] sides) {
        int answer = 0, min = sides[1];
        int submax = sides[0], max = 0;
        if(submax<min){
            submax = sides[1];
            min = sides[0];
        }
        //가장 긴 변의 길이가 max
        for(int i = submax; i<min+submax; i++){
            answer++;
        }
        //가장 긴 변의 길이가 submax
        for(int i = 1; i<submax; i++){
            if(submax<i+min){
                answer++;
            }
        }
        return answer;
    }
}