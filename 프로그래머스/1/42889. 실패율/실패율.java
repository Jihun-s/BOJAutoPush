import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i<N; i++){
            int j = 0, k = 0;
            for(int s:stages){
                if(s==i+1){
                    j++;
                }
                if(s > i){
                    k++;
                }
            }
            double d = 0;
            if(k != 0){
                d = (double) j/k;
            }
            map.put(i+1, d);
        }
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.<Integer, Double>comparingByValue().reversed());
        int n = 0;
        for(Map.Entry<Integer, Double> entry : entryList){
            answer[n] = entry.getKey();
            n++;
        }
        return answer;
    }
}