class Solution {
    public int solution(int[] num_list) {
        int j = 0;
        for(int i:num_list)
        {
            if(i<0)
            {
                return j;
            }j++;
        }
        return -1;
    }
}