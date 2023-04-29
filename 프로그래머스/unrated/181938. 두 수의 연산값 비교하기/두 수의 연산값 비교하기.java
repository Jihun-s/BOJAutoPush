class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a) + Integer.toString(b);
        int bb = (2*a*b);
        int aaa = Integer.parseInt(aa);
        if(aaa>=bb)
        {
            answer = aaa;
        }else answer = bb;
        return answer;
    }
}