class Solution {
    public int solution(String s) {
        int answer = 0; String val = "0";
        String[] arr = s.split(" ");
        for(String a:arr){
            if(a.matches("-?\\d+(\\.\\d+)?")){
                answer += Integer.parseInt(a);
            }else if(a.equals("Z")){
                answer -= Integer.parseInt(val);
            }
            val = a;
        }
        return answer;
    }
}