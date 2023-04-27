class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        boolean a = true;
        for(int i:num_list)
        {
            if(num_list.length>=11)
            {
                answer += i;
                a = false;
            }else if(num_list.length<=10)
                answer *=i;
        }if(a==false) answer -=1;
        return answer;
    }
}