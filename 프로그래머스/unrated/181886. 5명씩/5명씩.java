class Solution {
    public String[] solution(String[] names) {
        double count = 5.0; int j = 0;
        String[] answer = new String[(int) Math.ceil(names.length / count)];
        for(int i = 0; i<names.length; i++)
        {
            if(i%5==0)
            {
                answer[j] = names[i];
                j++;
            }
        }
        return answer;
    }
}