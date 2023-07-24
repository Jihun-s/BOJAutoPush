import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;
        for(int[] arr:commands){
            int[] arr1 = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
            Arrays.sort(arr1);
            answer[n] = arr1[arr[2]-1];
            n++;
        }
        return answer;
    }
}