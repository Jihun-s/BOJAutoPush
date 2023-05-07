class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<=myString.length() - pat.length(); i++)
        {
            int n = i;
            if(myString.charAt(i)==pat.charAt(0))
            {
                for(int j = 0; j<pat.length(); j++)
                {
                    if(myString.charAt(n+j)!=pat.charAt(j))
                    {  
                        break;
                    }
                    if(j == pat.length()-1)
                    {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}