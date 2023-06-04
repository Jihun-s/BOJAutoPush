class Solution {
    public int solution(int num, int k) {
        int answer = -1, i = 0;
        String s = Integer.toString(num);
        char[] a = s.toCharArray();
        for(char c:a){
            if(k == c-'0'){
                answer = i+1;
                break;
            }
            i++;
        }
        return answer;
    }
}