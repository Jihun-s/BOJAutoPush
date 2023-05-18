import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int cen = array.length/2;
        int answer = array[cen];
        return answer;
    }
}