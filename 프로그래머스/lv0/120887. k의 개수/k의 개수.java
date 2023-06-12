class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n<=j; n++){
            String val = Integer.toString(n);
            for (int m = 0; m < val.length(); m++) {
                if ((val.charAt(m)-'0') == k) {
                    answer++;
            }
        }
        }
        return answer;
    }
}