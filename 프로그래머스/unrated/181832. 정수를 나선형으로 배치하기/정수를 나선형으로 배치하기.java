class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int val = 1, row = 0, col = 0, dir = 0;
        while(val<=n*n)
        {
            answer[row][col] = val++;
            if(dir == 0)
            {
                if (col == n - 1|| answer[row][col+1]!=0)
                {
                    dir = 1;
                    row++;
                } else
                {
                    col++;
                }
            }//우향
            else if(dir == 1)
            {
                if (row == n - 1|| answer[row+1][col]!=0)
                {
                    dir = 2;
                    col--;
                } else
                {
                    row++;
                }
            }//하향
            else if(dir == 2)
            {
                if (col == 0|| answer[row][col-1]!=0)
                {
                    dir = 3;
                    row--;
                } else
                {
                    col--;
                }
            }//좌향
            else if(dir == 3)
            {
                if (row == 0|| answer[row-1][col]!=0)
                {
                    dir = 0;
                    col++;
                } else
                {
                    row--;
                }
            }//상향  
        }
        return answer;
    }
}