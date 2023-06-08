import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0, count = 1, val = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(count != 101){
            if(val%3!=0&&String.valueOf(val).indexOf('3') == -1){
                list.add(val);
                    count++;
            }
            val++;
        }
        answer = list.get(n-1);
        return answer;
    }
}