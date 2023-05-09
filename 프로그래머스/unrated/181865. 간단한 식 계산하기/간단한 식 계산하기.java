class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] s = binomial.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        char c = s[1].charAt(0);
        if(c == '+'){
            answer = a+b;
        }else if(c == '-'){
            answer = a-b;
        }else if(c == '*'){
            answer = a*b;
        }
        
        
        return answer;
    }
}