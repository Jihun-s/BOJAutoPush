class Solution {
    public int solution(int n) {
        int answer = 1, temp = 4;
        if(6>=n)
        {
            if(6%n==0){
            }else if(n == 4){
                answer = 2;
            }else{
                answer = 5;
            }
        }else if(6<n)
        {
            int j = 6;
            int s = n;
            while(j != 0)
            {
                temp = n%j;
                n = j;
                j = temp;
            }
            answer = s/n;
        }
        return answer;
    }
}