class Solution {
    public int solution(String my_string) {
        int answer = 0, count = 0;
        String val = "";
        for(int i = 0; i<my_string.length(); i++)
        {
            if(Character.isDigit(my_string.charAt(i)))
            {
                val += Character.toString(my_string.charAt(i));
            }else if(!val.equals(""))
            {
                answer += Integer.parseInt(val);
                val = "";
            }
        }
        if(!val.equals(""))
            answer += Integer.parseInt(val);
        return answer;
    }
}