class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            if(food[i]%2==0){
                for(int j = 0; j<food[i]/2; j++){
                    answer += i;
                }
            }else if(food[i]-1!=0){
                for(int j = 0; j<(food[i]-1)/2; j++){
                    answer += i;
                }
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reversed = sb.reverse().toString();
        answer += "0" + reversed;
        return answer;
    }
}