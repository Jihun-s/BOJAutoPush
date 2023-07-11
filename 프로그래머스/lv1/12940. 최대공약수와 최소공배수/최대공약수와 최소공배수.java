class Solution {
    public int[] solution(int n, int m) {
        int div = 0, mul = 0;
        for(int i = 1; i<n+m; i++){
            if(n%i==0&& m%i==0){
                div = i;
                mul = (n*m)/i;
            }
        }
        return new int[] {div, mul};
    }
}