class Solution {
    public String solution(String myString) {
        String answer = "";
        if(myString.length()>=1&&myString.length()<=100000)
        {
            if(myString.matches("[a-zA-Z]+"))
            {
                answer = myString.toLowerCase();
            }
        }
        return answer;
    }
}