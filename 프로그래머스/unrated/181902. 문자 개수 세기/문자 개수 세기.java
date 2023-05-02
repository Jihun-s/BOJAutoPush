class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i<my_string.length(); i++)
        {
            char a = my_string.charAt(i);
        for (int j = 65; j <= 90; j++)
        {
            if((int)a == j)
            {
                answer[j-65] += 1;
            }//if
        }//for
        for (int j = 97; j<=122; j++)
        {
            if((int)a == j)
            {
            answer[j-71] += 1;
            }//if
        }//innerfor
        }//outterfor
        return answer;
    }//public
}//solution