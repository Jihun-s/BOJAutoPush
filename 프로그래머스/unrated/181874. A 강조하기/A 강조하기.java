import java.lang.StringBuffer;
class Solution {
    public String solution(String myString) {
        String answer = ""; StringBuffer sb = new StringBuffer(myString);
        for(int i = 0; i<myString.length(); i++)
        {
            if(sb.charAt(i)=='a')
            {
                sb.setCharAt(i,'A');
            }else if(sb.charAt(i)!='A'&&Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        answer = sb.toString();
        return answer;
    }
}