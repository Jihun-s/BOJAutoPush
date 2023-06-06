class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for(String s:quiz){
            String[] mod = s.split(" ");
            if(mod[1].equals("+")){
                if(Integer.parseInt(mod[0]) + Integer.parseInt(mod[2]) == Integer.parseInt(mod[4]))
                {
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if(Integer.parseInt(mod[0]) - Integer.parseInt(mod[2]) == Integer.parseInt(mod[4]))
                {
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
            i++;
        }
        
        return answer;
    }
}