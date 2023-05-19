import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(array);
        int count = 1, maxcount = 0, answer = 0;

        if (array.length == 1) {
            return array[0];
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                count++;
            } else {
                list.add(count);
                count = 1;
            }
            if (i == array.length - 1) {
                list.add(count);
            }
        } // 각 중복 횟수

        for (int i : list) {
            if (maxcount < i)
                maxcount = i;
        } // 중복이 가장 많은 횟수

        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < maxcount) {
                list.remove(i); // 중복 횟수가 최빈값보다 작은 값을 제거
            }
        }

        if (list.size() > 1) {
            return -1; // 최빈값이 여러 개면 -1 반환
        }

        count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                count++;
            } else
                count = 1;
            if (count == maxcount) {
                return array[i];
            }
        } // 일반 답

        return 0;
    }
}