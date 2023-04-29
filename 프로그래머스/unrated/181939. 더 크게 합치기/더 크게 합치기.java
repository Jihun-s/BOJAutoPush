class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a) + Integer.toString(b);
        String bb = Integer.toString(b) + Integer.toString(a);
        int ab = Integer.parseInt(aa);
        int ba = Integer.parseInt(bb);
        
        if(ab>ba)
        {
            answer = ab;
        }else
            answer = ba;
        
        return answer;
    }
}