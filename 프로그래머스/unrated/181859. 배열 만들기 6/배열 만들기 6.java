import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            if(list.isEmpty() == true)
            {
                list.add(arr[i]);
                continue;
            }else if(list.get(list.size()-1) == arr[i])
            {
                list.remove(list.size()-1);
                continue;
            }else if(list.get(list.size()-1) != arr[i])
            {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        int n = 0;
        for(int i:list)
        {
            answer[n] = i;
            n++;
        }
        return answer;
    }
}