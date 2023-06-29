import java.util.*;

class Solution {
    public int solution(int[] arrows) {
        int answer = 0;
        Set<String> visitedPoints = new HashSet<>();  // 방문한 좌표를 저장하는 Set
        Set<String> visitedPaths = new HashSet<>();  // 방문한 경로를 저장하는 Set
        int x = 0;  // 현재 x 좌표
        int y = 0;  // 현재 y 좌표

        visitedPoints.add(getPointKey(x, y));  // 시작점을 방문한 것으로 처리

        for (int arrow : arrows) {
            for (int i = 0; i < 2; i++) {
                int newX = x;
                int newY = y;

                // 현재 이동 방향에 따라 새로운 좌표를 계산
                switch (arrow) {
                    case 0:  // 위로 한 칸
                        newY++;
                        break;
                    case 1:  // 오른쪽 한 칸 위 대각선
                        newX++;
                        newY++;
                        break;
                    case 2:  // 오른쪽 한 칸
                        newX++;
                        break;
                    case 3:  // 오른쪽 한 칸 아래 대각선
                        newX++;
                        newY--;
                        break;
                    case 4:  // 아래로 한 칸
                        newY--;
                        break;
                    case 5:  // 왼쪽 한 칸 아래 대각선
                        newX--;
                        newY--;
                        break;
                    case 6:  // 왼쪽 한 칸
                        newX--;
                        break;
                    case 7:  // 왼쪽 한 칸 위 대각선
                        newX--;
                        newY++;
                        break;
                }

                String currentPath = getPathKey(x, y, newX, newY);  // 현재 경로의 키
                String reversePath = getPathKey(newX, newY, x, y);  // 역방향 경로의 키

                // 현재 좌표를 방문한 적이 있으면서
                // 현재 경로를 방문한 적이 없거나, 역방향 경로를 방문한 적이 없는 경우
                if (visitedPoints.contains(getPointKey(newX, newY)) && !visitedPaths.contains(currentPath)
                        && !visitedPaths.contains(reversePath)) {
                    answer++;  // 방의 개수 증가
                }

                visitedPoints.add(getPointKey(newX, newY));  // 새로운 좌표를 방문한 것으로 처리
                visitedPaths.add(currentPath);  // 현재 경로를 방문한 것으로 처리

                x = newX;
                y = newY;
            }
        }

        return answer;
    }

    // 좌표 키 생성
    private String getPointKey(int x, int y) {
        return x + "," + y;
    }

    // 경로 키 생성
    private String getPathKey(int x1, int y1, int x2, int y2) {
        return getPointKey(x1, y1) + "->" + getPointKey(x2, y2);
    }
}

