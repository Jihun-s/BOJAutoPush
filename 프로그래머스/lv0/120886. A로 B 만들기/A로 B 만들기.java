import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        Arrays.sort(bef);
        Arrays.sort(aft);
        for(int i =0; i<before.length(); i++){
            if(bef[i] != aft[i]){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}