class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int[] var = new int[n];
        int count = 0, j = 0;
        for(int i = 0; i<num_list.length; i++)
        {
            var[count] = num_list[i];
            count++;
            if(count == n)
            {
                answer[j] = var;
                j++;
                var = new int[n];
                count = 0;
            }
        }
        return answer;
    }
}