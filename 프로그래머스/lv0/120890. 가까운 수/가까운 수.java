import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] array, int n) {
        int val = Integer.MAX_VALUE, answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:array){
            if(val>=Math.abs(i-n)){
                if(val>Math.abs(i-n)){
                    list.clear();
                }
                val = Math.abs(i-n);
                list.add(i);
            }
        }
        Collections.sort(list);
        answer = list.get(0);
        
        return answer;
    }
}