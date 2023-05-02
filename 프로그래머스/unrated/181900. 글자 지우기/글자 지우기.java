class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i<my_string.length(); i++)
        {
            for(int j:indices)
            {
                if(j == i)
                {
                    sb.setCharAt(i, 'X');
                }
            }
        }
        String answer = sb.toString();
        answer = answer.replace("X","");
        return answer;
    }
}