class Solution {
    public int[] solution(int[] num_list, int n) {
        int k = (int) Math.ceil(num_list.length / (double) n), j = 0;
        int[] answer = new int[k];
        
        for(int i = 0; i<num_list.length; i++)
        {
            if(i%n == 0)
            {
             answer[j] = num_list[i];
                j++;
            }
        }
        return answer;
    }
}