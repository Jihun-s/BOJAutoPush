class Solution {
    public int solution(int[] sides) {
        int answer = 2, max= Integer.MIN_VALUE;
        int a= sides[0], b = sides[1], c = sides[2];
        for(int i:sides){
            if(i>max){
                max = i;
            }
        }
        if(a == max){
            a = 0;
        }else if (b == max){
            b = 0;
        }else if (c == max){
            c = 0;
        }
        if(max < (a + b + c)){
            answer = 1;
        }
        return answer;
    }
}