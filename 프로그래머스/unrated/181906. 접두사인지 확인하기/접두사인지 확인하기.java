class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;String a = "";
        for(int i = 0; i<my_string.length(); i++)
        {
            a += Character.toString(my_string.charAt(i));
            if(is_prefix.equals(a))
            {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}