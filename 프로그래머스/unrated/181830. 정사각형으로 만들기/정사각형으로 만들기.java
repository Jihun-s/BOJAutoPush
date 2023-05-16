class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = new int[1][1];
        int side = 0, n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(arr[i].length<n)
            {
                side = n;
            }else{
                side = arr[i].length;
            }
        }
        if(side>n){}
        else{
            side = n;
        }
        answer = new int[side][side];
        for(int i = 0; i < side; i++)
        {
            for(int j = 0; j<side; j++)
            {
                if(i < n && j < arr[i].length)
                {
                    answer[i][j] = arr[i][j];
                }else
                {
                    answer[i][j] = 0;
                }
            }
        }
        
        
        return answer;
    }
}