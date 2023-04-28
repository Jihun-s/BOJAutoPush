class Solution {
    public int[] solution(int[] num_list) {
        int numSize = num_list.length;
        int[] answer = new int[numSize+1];
        for(int i = 0; i<numSize; i++)
        {
            answer[i] = num_list[i];
            if(i == (numSize-2)&&(num_list[i]<num_list[i+1]))
            {
                answer[i+2] = (num_list[i+1]-num_list[i]);
            }else if(i == (numSize-2)&&!(num_list[i]<num_list[i+1]))
            {
               answer[i+2] = num_list[i+1]*2;
            }else if(i == numSize-2)
            {
                break;
            }
        }
        return answer;
    }
}