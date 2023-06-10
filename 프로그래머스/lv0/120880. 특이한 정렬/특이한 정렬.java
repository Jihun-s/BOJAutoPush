import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Integer[] numlistWrapper = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            numlistWrapper[i] = numlist[i];
        }
        Arrays.sort(numlistWrapper, Comparator.comparingInt((Integer a) -> Math.abs(n - a)).thenComparing(Comparator.reverseOrder()));
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlistWrapper[i];
        }
        
        return answer;
    }
}
