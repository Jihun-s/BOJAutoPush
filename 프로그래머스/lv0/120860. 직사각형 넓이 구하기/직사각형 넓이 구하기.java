class Solution {
    public int solution(int[][] dots) {
        int answer = 0, ymax = Integer.MIN_VALUE, ymin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE, xmin = Integer.MAX_VALUE;
        for(int i = 0; i<4; i++){
            if(dots[i][1]>ymax)
            {
                ymax = dots[i][1];
            }
            if(dots[i][1]<ymin){
                ymin = dots[i][1];
            }
            if(dots[i][0]>xmax)
            {
                xmax = dots[i][0];
            }
            if(dots[i][0]<xmin){
                xmin = dots[i][0];
            }
        }
        answer = (xmax - xmin) * (ymax - ymin);
        return Math.abs(answer);
    }
}