import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){ // i는 nums.length - 2까지만 반복
            for(int j = i + 1; j < nums.length - 1; j++){ // j는 i+1부터 시작
                for(int k = j + 1; k < nums.length; k++){ // k는 j+1부터 시작
                    if(isPrime((nums[i] + nums[j] + nums[k])))
                       answer++;
                }
            }
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
