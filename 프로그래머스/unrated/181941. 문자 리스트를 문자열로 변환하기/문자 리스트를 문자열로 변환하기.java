class Solution {
    public String solution(String[] arr) {
        String answer = "";
        if(arr.length>=1&&arr.length<=200)
        {
            for(String a:arr)
            {
                if(a.matches("[a-z]+"))
                    answer += a;
            }
        }
        return answer;
    }
}