import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[0] * numbers[1];
        if(numbers[numbers.length-1] * numbers[numbers.length-2] > answer){
            answer = numbers[numbers.length-2] * numbers[numbers.length-1];
        }
        return answer;
    }
}