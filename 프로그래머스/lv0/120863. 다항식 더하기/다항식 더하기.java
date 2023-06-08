class Solution {
    public String solution(String polynomial) {
        String answer = "", val = "";
        int figures = 0, inte = 0;
        String[] arr = polynomial.split(" ");
        for(String s:arr){
            if(s.contains("x")){
                if(s.length()==1){
                    figures++;
                }else{
                    val = s.replace("x", "");
                    figures+= Integer.parseInt(val);
                }
            }else if(!s.equals("+")){
                inte += Integer.parseInt(s);
            }
        }
        
        if(figures != 0&& figures!= 1){
            answer += (Integer.toString(figures) + "x");
        }else if(figures == 1){
            answer += "x";
        }
        if(inte != 0){
            if(figures == 0){
                answer += (Integer.toString(inte));
            }else
                answer += (" + " + Integer.toString(inte));
        }
        return answer;
    }
}