class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double slope1 = getSlope(dots[0], dots[1]);
        double slope2 = getSlope(dots[2], dots[3]);
        if (slope1 == slope2) {
            return 1;
        }
        slope1 = getSlope(dots[0], dots[2]);
        slope2 = getSlope(dots[1], dots[3]);
        if (slope1 == slope2) {
            return 1;
        }
        slope1 = getSlope(dots[0], dots[3]);
        slope2 = getSlope(dots[1], dots[2]);
        if (slope1 == slope2) {
            return 1;
        }
        return answer;
    }
    
    // 두 점을 이어 직선의 기울기를 계산하는 메서드
    private double getSlope(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        // 두 점 사이의 기울기 계산
        return (double) (y2 - y1) / (x2 - x1);
    }
}