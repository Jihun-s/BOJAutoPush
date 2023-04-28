class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = numLog.length-1; i>0; i--)
        {
            int a = numLog[i]-numLog[i-1];
            if(a == 1)
            {
                answer +="w";
            }
            if(a == -1)
            {
                answer +="s";
            }
            if(a == 10)
            {
                answer +="d";
            }
            if(a == -10)
            {
                answer +="a";
            }
        }
        StringBuilder reversedString = new StringBuilder(answer);
        reversedString = reversedString.reverse();
        return reversedString.toString();
    }
}