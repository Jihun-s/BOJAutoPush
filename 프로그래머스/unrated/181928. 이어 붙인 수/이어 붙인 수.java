class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "", even = "";
        for(int i:num_list)
        {
            if(i%2!=0)
            {
                odd += Integer.toString(i);
            }
        }
        for(int i:num_list)
        {
            if(i%2==0)
            {
                even += Integer.toString(i);
            }
        }
        int oddC = Integer.parseInt(odd);
        int evenC = Integer.parseInt(even);
        answer = oddC + evenC;
        return answer;
    }
}