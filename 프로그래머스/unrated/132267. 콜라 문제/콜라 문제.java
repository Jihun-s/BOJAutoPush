class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n/a> 0) {
            int get = n / a;
            answer += get * b;
            n = n % a + get*b;
        }
        return answer;
    }
}