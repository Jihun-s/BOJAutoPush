class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        if(my_string.length()>=1&&my_string.length()<=100)
        {
            if(my_string.matches("[a-z]+"))
            {
                if(k>=1&&k<=100)
                {
                    for(int i = 1; i<=k; i++)
                    {
                        answer += my_string;
                    }
                }
            }
        }
        return answer;
    }
}