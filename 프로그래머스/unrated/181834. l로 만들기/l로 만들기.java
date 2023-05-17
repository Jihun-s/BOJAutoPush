class Solution {
    public String solution(String myString) {
        String answer = ""; int l = 'l';
        for(int i = 0; i<myString.length(); i++)
        {
            int n = myString.charAt(i);
            if(n<l)
            {
                answer += "l";
            }else
                answer += myString.charAt(i);
        }
        return answer;
    }
}