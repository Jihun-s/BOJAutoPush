class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
         for(int j = 0; j<queries.length; j++)
        {
            int a = queries[j][0];
            int b = queries[j][1];
            int k = queries[j][2];
            int min = Integer.MAX_VALUE;
            for(int i = a; i<=b; i++)
            {
                if(arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            if(min == Integer.MAX_VALUE) {
                answer[j] = -1;
            } else {
                answer[j] = min;
            }
        }
        return answer;
    }
}