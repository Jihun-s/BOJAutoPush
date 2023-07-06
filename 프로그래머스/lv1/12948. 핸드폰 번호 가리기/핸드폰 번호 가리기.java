class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String back_Number = phone_number.substring(len-4, len);
        String num = "";
        for(int i = 0; i < len-4; i++){
            num += '*';
        }
        
        return num + back_Number;
    }
}