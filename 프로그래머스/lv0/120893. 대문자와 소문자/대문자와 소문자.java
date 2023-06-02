class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++)
        {
            int a = my_string.charAt(i);
            if(a>64&&a<91)          //대문자
            {
                answer += Character.toString(my_string.charAt(i)).toLowerCase();
                
            }else if(a>96&&a<123)   //소문자
            {
                answer += Character.toString(my_string.charAt(i)).toUpperCase();
            }
        }
        return answer;
    }
}