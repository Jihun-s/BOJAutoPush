class Solution {
    public String solution(String bin1, String bin2) {
        int dec1 = Integer.parseInt(bin1, 2);
        int dec2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(dec1 + dec2);
    }
}