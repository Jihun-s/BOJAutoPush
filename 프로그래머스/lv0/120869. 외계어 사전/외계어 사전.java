class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String d : dic) {
            boolean containsAll = true;
            for (String s : spell) {
                if (!d.contains(s)) {
                    containsAll = false;
                    break;
                }
            }
            if (containsAll) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}