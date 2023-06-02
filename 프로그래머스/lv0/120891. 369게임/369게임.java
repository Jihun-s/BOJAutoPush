class Solution {
    public int solution(int order) {
        int answer = 0;
        String ord = ""+order;
        for(int i = 0; i<ord.length(); i++)
        {
            int val = ord.charAt(i) - '0';
            if(val==3||val==6||val==9){
                answer++;
            }
        }
        return answer;
    }
}