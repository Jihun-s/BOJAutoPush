class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil(my_str.length()/(double)n)];
        String val = "";
        int count = 0;
        char[] arr = my_str.toCharArray();
        for(int i = 0; i<arr.length; i++){
            val += Character.toString(arr[i]);
            if((i+1)%n == 0){
                answer[count] = val;
                val = "";
                count++;
            }else if(i == arr.length-1){
                answer[count] = val;
            }
        }
        return answer;
    }
}