import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] ave = new double[score.length];
        int i = 0;
        for (int[] arr : score) {
            ave[i] = (arr[0] + arr[1]) / 2.0;
            i++;
        }

        for (int j = 0; j < score.length; j++) {
            int rank = 1;
            for (int k = 0; k < score.length; k++) {
                if (ave[j] < ave[k]) {
                    rank++; // 더 높은 점수를 가진 학생들을 만날 때마다 등수 증가
                }
            }
            answer[j] = rank; // 등수를 저장
        }

        return answer;
    }
}


