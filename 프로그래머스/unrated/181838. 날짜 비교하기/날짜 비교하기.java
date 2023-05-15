class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[2]<date2[2])
        {
            answer = 1;
        }else answer = 0;
        //일 비교
        if(date1[1]<date2[1])
        {
            answer = 1;
        }else if(date1[1]==date2[1])
        {
        }else answer = 0;
        //월 비교
        if(date1[0]<date2[0])
        {
            answer = 1;
        }else if(date1[0]==date2[0])
        {
        }else answer = 0;
        //년도 비교
        return answer;
    }
}