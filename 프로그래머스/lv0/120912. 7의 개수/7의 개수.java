class Solution {
    public int solution(int[] array) {
        String seven = "";
        int answer = 0;
        for(int i:array){
            seven += Integer.toString(i);
        }
        char[] a = seven.toCharArray();
        for(char c:a){
            if(c == '7')
                answer++;
        }
        return answer;
    }
}