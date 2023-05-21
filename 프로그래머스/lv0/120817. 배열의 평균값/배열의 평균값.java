class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i:numbers)
            answer += i;
        double n = answer%1.0;
        if(n==0.0||n==0.5){
            answer /=numbers.length;
        }
        else{
            answer/=numbers.length;
            answer = (int)answer;
        }
        return answer;
    }
}