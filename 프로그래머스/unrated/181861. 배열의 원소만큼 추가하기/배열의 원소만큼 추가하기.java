class Solution {
    public int[] solution(int[] arr) {
        int n = 0;
        for(int i:arr)
        {n+=i;}
        int[] answer = new int[n];
        n = 0;
        for(int i:arr)
        {
            for(int j = 0; j<i; j++)
            {
                answer[n++] = i;
            }
        }
        return answer;
    }
}