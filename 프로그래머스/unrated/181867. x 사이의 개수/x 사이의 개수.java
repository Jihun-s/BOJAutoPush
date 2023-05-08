class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -9999);
        int[] answer = new int[str.length];
        int i = 0;
        for(String s:str)
        {
            answer[i] = s.length();
            i++;
        }
        
        return answer;
    }
}