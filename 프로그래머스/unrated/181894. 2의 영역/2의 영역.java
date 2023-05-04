import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = {};
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                a = i;
                break;
            }
        }//전방에 2 발견.
        for (int i = arr.length-1; i >= a; i--) {
            if (arr[i] == 2) {
                b = i;
                break;
            }
        }
        // 후방에서 2 발견
        for (int i = a; i <= b; i++) {
            list.add(arr[i]);
        }//전방2인덱스a ~ 후방 인덱스 b 리스트 입력
        if(list.get(0) != 2)
        {
            answer = new int[] {-1};
        }// 2가 없으면 -1;
        else if (list.size() >= 1) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}