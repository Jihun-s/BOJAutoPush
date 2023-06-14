class Solution {
    public int solution(int[] common) {
        int answer = 0, len = common.length;
        int fnum = common[1]-common[0], snum = common[2]-common[1];
        int ratio = 0;
        if(common[0] != 0){
            ratio = common[1]/common[0];
        }
        if(fnum == snum){
            answer = common[len-1] + fnum;
        }else{
            answer = common[len-1] * ratio;
        }
        return answer;
    }
}