import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i<my_string.length(); i++)
        {
            if(Character.isDigit(my_string.charAt(i)))
            {
                list.add(my_string.charAt(i));
            }
        }
        Character[] array = list.toArray(new Character[0]);
        Arrays.sort(array);
        int[] answer = new int[array.length];
        for(int i = 0; i<array.length; i++)
        {
            answer[i] = Character.getNumericValue(array[i]);
        }
        
        return answer;
    }
}