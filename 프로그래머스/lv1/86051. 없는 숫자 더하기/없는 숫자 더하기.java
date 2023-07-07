class Solution {
    public int solution(int[] numbers) {
        boolean[] found = new boolean[10];
        for (int num : numbers) {
            found[num] = true;
        }
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!found[i]) {
                answer += i;
            }
        }
        return answer;
    }
}