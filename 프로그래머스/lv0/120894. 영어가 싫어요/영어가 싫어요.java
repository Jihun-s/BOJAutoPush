class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String s = "", ans = "";
        for(int i = 0; i<numbers.length(); i++)
        {
            s += Character.toString(numbers.charAt(i));
            if (s.equals("one")) {
                ans += "1";
                s = "";
            } else if (s.equals("two")) {
                ans += "2";
                s = "";
            } else if (s.equals("three")) {
                ans += "3";
                s = "";
            } else if (s.equals("four")) {
                ans += "4";
                s = "";
            } else if (s.equals("five")) {
                ans += "5";
                s = "";
            } else if (s.equals("six")) {
                ans += "6";
                s = "";
            } else if (s.equals("seven")) {
                ans += "7";
                s = "";
            } else if (s.equals("eight")) {
                ans += "8";
                s = "";
            } else if (s.equals("nine")) {
                ans += "9";
                s = "";
            } else if (s.equals("zero")) {
                ans += "0";
                s = "";
            }
        }
        answer = Long.parseLong(ans);
        return answer;
    }
}