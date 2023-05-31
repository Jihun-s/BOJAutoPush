import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int n= numbers[numbers.length-1], m = numbers[numbers.length-2];
        answer = n*m;
        return answer;
    }
}