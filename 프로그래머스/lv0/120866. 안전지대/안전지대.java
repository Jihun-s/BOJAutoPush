class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] directions = {
                    {-1, -1}, {-1, 0}, {-1, 1},
                    {0, -1},           {0, 1},
                    {1, -1},  {1, 0},  {1, 1}
                };
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if (board[i][j] == 1){
                for (int[] dir : directions) {
                    int newRow = i + dir[0];
                    int newCol = j + dir[1];
                    if (newRow >= 0 && newRow < board.length && newCol >= 0 && 
                        newCol < board.length) {
                        if(board[newRow][newCol] != 1)
                        board[newRow][newCol] = 2;
                    }
                }
                }
            }
        }
        for(int[] out:board){
            for(int inner: out){
                if(inner == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}