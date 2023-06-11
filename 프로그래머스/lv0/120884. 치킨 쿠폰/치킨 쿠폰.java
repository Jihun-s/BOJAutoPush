class Solution {
    public int solution(int chicken) {
        int coupon = chicken; // 받은 치킨 수로 초기 쿠폰 수를 설정
        int answer = 0; // 서비스 치킨 수

        while (coupon >= 10) { // 쿠폰이 10장 이상일 때 계속 반복
            int newChicken = coupon / 10; // 새로운 치킨 수 계산
            answer += newChicken; // 서비스 치킨에 추가
            coupon = coupon % 10 + newChicken; // 남은 쿠폰 수 업데이트
        }

        return answer;
    }
}