import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int a:arr)
        {
            Integer b = new Integer(a);
            list.add(b);
        }
        
        for(int i = 0; i<query.length; i++)
        {
            if(i==0)
            {
                list.subList(query[0]+1, list.size()).clear();
                
            }else if(i%2==1)
            {
                list.subList(0,query[i]).clear();
            }else if(i%2==0)
            {
                list.subList(query[i]+1, list.size()).clear();
            }
        }int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++)
        {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}