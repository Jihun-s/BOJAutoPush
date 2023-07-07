class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int n = 0;
        if(arr.length == 1)
            return new int[] {-1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i = 0; i<answer.length; i++){
            if(arr[n] == min){
                i--;
            }else
                answer[i] = arr[n];
            n++;
        }
        return answer;
    }
}