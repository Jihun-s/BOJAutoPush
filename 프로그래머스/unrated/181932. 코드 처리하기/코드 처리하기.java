class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] b = new String[code.length()]; 
		for(int i=0; i<code.length(); i++)
		{
			char a = code.charAt(i);
			b[i] = Character.toString(a);
			if(mode ==0&&!(b[i].equals("1"))&&i%2==0)
			{
				answer += b[i];
			}
			else if(mode ==0&&b[i].equals("1"))
			{
				mode =1;continue;
			}
			
			if(mode ==1&&!(b[i].equals("1"))&&i%2==1)
			{
				answer += b[i];
			}
			else if(mode ==1&&b[i].equals("1"))
			{
				mode =0;continue;
			}
		}
        if(answer == "")
        return "EMPTY";
        else
        return answer;
    }
}