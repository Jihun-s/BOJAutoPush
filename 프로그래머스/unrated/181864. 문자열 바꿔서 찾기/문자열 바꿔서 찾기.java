class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;String replace = "";
        for(int i = 0; i<myString.length(); i++)
        {
            if(myString.charAt(i) == ('A'))
            {
                replace += "B";
            }else if(myString.charAt(i) == ('B'))
            {
                replace += "A";
            }
        }
        if(replace.contains(pat))
        {
            answer = 1;
        }
        return answer;
    }
}