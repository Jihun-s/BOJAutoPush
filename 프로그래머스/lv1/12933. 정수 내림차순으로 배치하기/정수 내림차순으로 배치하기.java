import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<Long>();
        while(n != 0){
            list.add(0, n%10);
            n/=10;
        }
        long[] arr = new long[list.size()];
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            long temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            answer = answer * 10 + arr[i];
        }
        return answer;
    }
}