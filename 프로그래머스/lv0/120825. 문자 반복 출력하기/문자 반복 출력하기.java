class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int j = 0; j<my_string.length(); j++)
        {
            String s = Character.toString(my_string.charAt(j));
            for(int i = 0; i<n; i++)
            {
                answer += s;
            }
        }
        return answer;
    }
}