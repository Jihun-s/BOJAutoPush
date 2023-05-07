class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int n = pat.length(), m = 0;
        for (int i = myString.length() - 1; i >= 0; i--) {
            m = i;
            if (pat.charAt(n - 1) == myString.charAt(i)) {
                for (int j = n - 1; j >= 0; j--) {
                    if (myString.charAt(m) == pat.charAt(j)) {
                        m--;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        for (int i = 0; i <= m+n; i++) {
            answer += myString.charAt(i);
        }
        return answer;
    }
}