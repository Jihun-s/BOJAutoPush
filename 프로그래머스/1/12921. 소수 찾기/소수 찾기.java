class Solution {
    public int solution(int n) {
        int i = 2, answer = 0;
        while(i!=n+1){
            if(isPrime(i)){
                answer++;
            }
            i++;
        }
        return answer;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 이하의 수는 소수가 아님
        }
        if (n <= 3) {
            return true; // 2와 3은 소수
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // 2나 3으로 나누어지면 소수가 아님
        }

        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false; // 6의 배수 ±1 위치에서 나누어지는지 확인
            }
            i += 6; // 다음 6의 배수로 이동
        }
        return true;
    }
}