class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int son = (numer1 * denom2) + (numer2 * denom1),
        rson = (numer1 * denom2) + (numer2 * denom1);
        int mot = denom1 * denom2, gcd = denom1 * denom2;
        while (son != 0) {
        int temp = gcd % son;
        gcd = son;
        son = temp;
        }
        answer[0] = rson/gcd;
        answer[1] = mot/gcd;
        return answer;
    }
}