class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = new String[babbling.length];
        int i = 0;
        for(String s:babbling)
        {
            if(s.contains("aya"))
            {
                s = s.replace("aya", "1");
            }if(s.contains("ye"))
            {
                s = s.replace("ye", "1");
            }if(s.contains("woo"))
            {
                s = s.replace("woo", "1");
            }if(s.contains("ma"))
            {
                s = s.replace("ma", "1");
            }
            bab[i] = s;
            i++;
        }
        for(String s:bab)
        {
            if(s.equals("1")||s.equals("11")||s.equals("111")
               ||s.equals("1111"))
            {
                answer++;
            }
        }
        return answer;
    }
}