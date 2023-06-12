import java.lang.StringBuilder;
class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int n = 0;
        if(A.equals(B)){
            return 0;
        }
        while(n != A.length()){
            sb = new StringBuilder();
            for(int i = 0; i<A.length(); i++){
                if(i < A.length()-1){
                    sb.append(Character.toString(A.charAt(i)));
                }else{
                    sb.insert(0, Character.toString(A.charAt(i)));
                }
            }
            A = sb.toString();
            answer++;
            if(A.equals(B))
                return answer;
            n++;
        }
        answer = -1;
        return answer;
    }
}