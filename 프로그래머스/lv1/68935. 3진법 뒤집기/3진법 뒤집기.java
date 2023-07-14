class Solution {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        }
        
        StringBuilder toBase3 = new StringBuilder();
        while (n != 0) {
            int remainder = n % 3;
            toBase3.append(remainder); // 나머지를 뒤에 추가
            n /= 3;
        }
        
        int base10 = 0;
        int power = 0;
        for (int i = toBase3.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(toBase3.charAt(i));
            base10 += digit * Math.pow(3, power);
            power++;
        }
        
        return base10;
    }
}