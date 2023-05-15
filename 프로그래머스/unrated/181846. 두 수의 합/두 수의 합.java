class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int min = 0, count = 0, max = 0;
        String answer = "";
        if(a.equals("0")&&b.equals("0"))
        {
            answer = "0";
            return  answer;
        }
        if(a.length()>= b.length())
        {
            min = b.length();
            max = a.length();
        }else
        {
            min = a.length();
            max = b.length();
        }
        for(int i = 0; i<min; i++)
        {
            int aa = Character.getNumericValue(a.charAt(a.length()-i-1));
            int bb = Character.getNumericValue(b.charAt(b.length()-i-1));
            sb.insert(0, (aa+bb+count)%10);
            if(aa+bb+count>=10)
            {
                count = 1;
            }else{
                count = 0;
            }
        }
        for(int i = min; i<max; i++)
        {
            if(max == a.length())
            {
                int c = Character.getNumericValue(a.charAt(a.length()-i-1));
                sb.insert(0, (c + count)%10);
                count = (c+count >= 10) ? 1 : 0;
            }else if(max == b.length())
            {
                int c = Character.getNumericValue(b.charAt(b.length()-i-1));
                sb.insert(0, (c + count)%10);
                count = (c+count >= 10) ? 1 : 0;
            }
        }
        if(count == 1)
        {
            sb.insert(0, "1");
        }
        answer = sb.toString();
        return answer;
    }
}