class Solution {
    public String solution(String my_string) {
        String answer = "";
        int n = my_string.length()-1;
        for(int i = 0; i<my_string.length(); i++)
        {
            answer += Character.toString(my_string.charAt(n));
            n--;
        }
        return answer;
    }
}