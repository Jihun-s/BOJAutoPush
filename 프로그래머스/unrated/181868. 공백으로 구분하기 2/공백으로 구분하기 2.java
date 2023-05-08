class Solution {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean isSpace = false;
        for (char c : my_string.toCharArray()) {
            if (c == ' ') {
                if (!isSpace) {
                    sb.append(c);
                }
                isSpace = true;
            } else {
                sb.append(c);
                isSpace = false;
            }
        }
        String str = sb.toString().trim();
        String[] answer = str.split(" ");
        return answer;
    }
}