class Solution {
    public String solution(int age) {
        String answer = "";
        if(age>=1000){
            int tho = age / 1000;
            answer += Character.toString(tho+97);
        }
        if(age>=100){
            int hun = (age % 1000) / 100;
            answer += Character.toString(hun+97);
        }
        if(age>=10){
            int ten = (age % 100) / 10;
            answer += Character.toString(ten+97);
        }
        int one = age%10;
        answer += Character.toString(one+97);
        return answer;
    }
}