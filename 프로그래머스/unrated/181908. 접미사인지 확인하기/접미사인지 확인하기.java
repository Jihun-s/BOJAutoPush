class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0; int j = 0;
		String[] s = new String[my_string.length()];
		for(int i = 0; i<my_string.length(); i++)
		{
		    s[i] = my_string.substring(my_string.length()-1-j);
		    j++;
		}
        for(String a:s)
        {
            if(a.equals(is_suffix))
            {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}