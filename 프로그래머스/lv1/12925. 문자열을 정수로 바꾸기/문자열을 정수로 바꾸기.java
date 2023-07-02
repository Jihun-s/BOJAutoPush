class Solution {
    public int solution(String s) {
        int answer = 0, len = s.length();
        if(s.charAt(0) == '-'){
            answer = -1 * Integer.parseInt(s.substring(1, len));
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}