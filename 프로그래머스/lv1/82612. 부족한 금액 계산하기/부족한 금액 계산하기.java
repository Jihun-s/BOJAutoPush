class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0, total = 0;
        for(int i = 1; i<=count; i++){
            total += price * i ;
        }
        answer = money - total;
        if(answer >= 0){
            answer = 0;
        }
        return Math.abs(answer);
    }
}