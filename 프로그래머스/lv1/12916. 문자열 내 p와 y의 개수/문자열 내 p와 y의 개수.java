class Solution {
    boolean solution(String s) {
        String ss = s.toUpperCase();
        int n = 0;
        for(int i = 0; i<s.length(); i++){
            if(ss.charAt(i) == 'P'){
                n++;
            }else if(ss.charAt(i)=='Y'){
                n--;
            }
        }
        return n==0;
    }
}