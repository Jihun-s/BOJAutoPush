class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int n = 0;
        if(direction.equals("left")){
            for(int i = 0; i<numbers.length; i++)
            {
                n++;
                if(n==numbers.length){
                    n = 0;
            }
                answer[i] = numbers[n];
            }
        }else if(direction.equals("right")){
            for(int i = 0; i<numbers.length; i++)
            {
                n++;
                if(n>=numbers.length){
                    n = 0;
            }
                answer[n] = numbers[i];
            }
        }
        
        return answer;
    }
}