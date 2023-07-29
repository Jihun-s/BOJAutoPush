class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		StringBuilder sb = new StringBuilder(s);
		for(int i = 1; i<sb.length(); i++){
			for(int j = 0; j<i; j++){
				if(sb.charAt(i)==sb.charAt(j)){
					answer[i] = i-j;
				}
			}
		}
		for(int i = 0; i<sb.length(); i++){
			if(answer[i] == 0){
				answer[i] = -1;
			}
		}
        return answer;
    }
}