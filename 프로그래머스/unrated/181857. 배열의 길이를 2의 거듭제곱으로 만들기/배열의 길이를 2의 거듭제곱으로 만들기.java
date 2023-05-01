class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        while(true)
        {
            if((n & (n - 1)) == 0)
            {
                break;
            }
            n++;
        }
        int[] answer = new int[n];
        for(int i = 0; i<n; i++)
        {
            if(arr.length>i)
            answer[i] = arr[i];
            else
            answer[i] = 0;
        }
        return answer;
    }
}