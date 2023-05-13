import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
class Solution {
    public int solution(String[] strArr) {
        int n = 0;
        int[] arr = new int[strArr.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(String s:strArr)
        {
            arr[n] = s.length();
            n++;
        }//str 요소 길이 추출
        Arrays.sort(arr);
        n = 1;//같은 '요소길이' 개수
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]==arr[i-1])
            {
                n++;
                if(i == arr.length-1)
                {
                    list.add(n);
                }
            }else
            {
                list.add(n);
                n = 1;
            }
        }//list는 각 요소 개수
        int max;
        try {
            max = Collections.max(list);
        } catch (NoSuchElementException e) {
            max = 0; // 빈 ArrayList의 경우 0으로 초기화
        }
        if(arr.length == 1)
        {
            max = 1;
        }
        return max;
    }
}