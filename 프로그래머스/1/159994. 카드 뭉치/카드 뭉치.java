class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
		int index1 = 0, index2 = 0;
        String answer = "Yes";
        loop1:
        for(int i = 0; i<goal.length; i++){
            if(index1<cards1.length&&goal[i].equals(cards1[index1])) {
            	index1++;
            	continue;
            }
			if(index2<cards2.length&&goal[i].equals(cards2[index2])) {
				index2++;
				continue;
			}
            answer = "No";
        }
        return answer;
    }
}