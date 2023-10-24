import java.util.*;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int startIdx = 0;
        
        while (startIdx < section.length) {
            int start = section[startIdx];
            int end = start + m - 1;
            while (startIdx < section.length && section[startIdx] <= end) {
                startIdx++;
            }
            answer++;
        }
        
        return answer;
    }
}
