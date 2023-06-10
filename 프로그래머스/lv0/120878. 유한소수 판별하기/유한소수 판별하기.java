class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int gcd = gcd(a, b);
        b /= gcd; a /= gcd;
        if(a%b==0)
            answer = 1;
        while(b % 2==0){
            b /= 2;
        }
        while(b%5==0){
            b /= 5;
        }
        if(b == 1) answer = 1;
        return answer;
    }
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}