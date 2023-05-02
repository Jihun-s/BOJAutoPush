class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";String[][] a = new String[my_string.length()/m][m];
        int k = 0;
        for(int i = 0; i<my_string.length()/m; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j] = Character.toString(my_string.charAt(k));
                k++;
            }
            answer += a[i][c-1];
        }
        return answer;
    }
}