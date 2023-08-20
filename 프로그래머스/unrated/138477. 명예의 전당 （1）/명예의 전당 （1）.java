import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hall = new PriorityQueue<>(); // 명예의 전당 목록
        int minDays = Math.min(k, score.length); // k와 score의 길이 중 작은 값

        // 초기 minDays일까지는 명예의 전당에 모든 점수를 추가
        for (int i = 0; i < minDays; i++) {
            hall.offer(score[i]);
            answer[i] = hall.peek(); // 제일 낮은 점수 추가
        }

        // minDays 이후부터는 새로운 점수가 k번째 순위보다 높으면 명예의 전당에 추가
        for (int i = minDays; i < score.length; i++) {
            if (score[i] > hall.peek()) {
                hall.poll(); // 제일 낮은 점수를 명예의 전당에서 탈락
                hall.offer(score[i]); // 새로운 점수를 명예의 전당에 추가
            }
            answer[i] = hall.peek(); // 제일 낮은 점수 추가
        }

        return answer;
    }
}
