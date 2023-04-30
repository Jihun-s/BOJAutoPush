class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = ""; StringBuilder sb = new StringBuilder();
        for(int i = 0; i<queries.length; i++)
        {
            int s = queries[i][0];
            int e = queries[i][1];
            
            sb.setLength(0);
        for (int j = e; j >=s; j--) {
            sb.append(my_string.charAt(j));
        }
        for(int k = s; k<=e; k++)
        {
            my_string = my_string.substring(0, s) + sb.toString() + my_string.substring(e+1);
        }
        }
        return my_string;
    }
}