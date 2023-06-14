import java.util.ArrayList;
class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int mid = total/num, min = num/2;
        
        if(num%2 != 0){
            for(int i = mid - min; i<= mid + min; i++){
                list.add(i);
            }
        }else{
            for(int i = mid - min+1; i<= mid + min; i++){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}