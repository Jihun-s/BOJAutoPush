class Solution {
    public int[] solution(int n, int m) {
        int div = 0, mul = 0, min = 0, max = 0;
        if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        for(int i = 1; i<max; i++){
            if(n%i==0&& m%i==0){
                div = i;
            }
        }
        for(int i = 1; i<=min; i++){
            if((max*i)%min==0){
                mul = max*i;
                break;
            }
        }
        
        return new int[] {div, mul};
    }
}