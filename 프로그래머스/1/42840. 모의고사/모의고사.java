import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] answers) {
        int a1Count = 0, a2Count = 0, a3Count = 0;
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i<answers.length; i++){
            if(a1[i%a1.length] == answers[i]){
                a1Count++;
            }
            if(a2[i%a2.length] == answers[i]){
                a2Count++;
            }
            if(a3[i%a3.length] == answers[i]){
                a3Count++;
            }
        }
        int higher = 0;
        if(higher<a1Count){
            higher = a1Count;
        }
        if(higher<a2Count){
            higher = a2Count;
        }
        if(higher<a3Count){
            higher = a3Count;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(a1Count == a2Count&& a2Count == a3Count){
            Collections.addAll(list, 1, 2, 3);
        }else if(higher == a1Count&& higher == a2Count){
            Collections.addAll(list, 1, 2);
        }else if(higher == a2Count&& higher == a3Count){
            Collections.addAll(list, 2, 3);
        }else if(higher == a1Count&& higher == a3Count){
            Collections.addAll(list, 1, 3);
        }else if(higher == a1Count){
            list.add(1);
        }else if(higher == a2Count){
            list.add(2);
        }else if(higher == a3Count){
            list.add(3);
        }
        
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}