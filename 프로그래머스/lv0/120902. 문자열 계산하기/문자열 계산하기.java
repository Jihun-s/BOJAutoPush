class Solution {
    public int solution(String my_string) {
        int answer = 0, count = 0;
        String[] val = my_string.split(" ");
        for(int i = 0; i<val.length; i++){
            if(i%2!=0)
            {
                if(i==1)
                {
                    count = Integer.parseInt(val[i-1]);
                }else{
                    count = answer;
                }
                switch(val[i]){
                    case "+":
                        answer = count + Integer.parseInt(val[i+1]);
                        break;
                    case "-":
                        answer = count - Integer.parseInt(val[i+1]);
                        break;
                }
            }
        }
        return answer;
    }
}