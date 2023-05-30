import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        int val = balls-share;
        BigInteger ball = BigInteger.ONE;
        for (int i = 1; i <= balls; i++) {
            ball = ball.multiply(BigInteger.valueOf(i));
        }
        BigInteger vals = BigInteger.ONE;
        for (int i = 1; i <= val; i++) {
            vals = vals.multiply(BigInteger.valueOf(i));
        }
        BigInteger shares = BigInteger.ONE;
        for (int i = 1; i <= share; i++) {
            shares = shares.multiply(BigInteger.valueOf(i));
        }
        BigInteger den = vals.multiply(shares);
        BigInteger ans = ball.divide(den);
        int answer = ans.intValue();
        return answer;
    }
}