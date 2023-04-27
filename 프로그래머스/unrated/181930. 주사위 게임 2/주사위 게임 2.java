class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = (a+b+c);
        int pow = (a*a+b*b+c*c);
        if(a!=b&&b!=c&&c!=a)
        {
            answer = sum;
        }else if((a==b&&b!=c)||(b==c&&c!=a)||(a==c&&c!=b))
        {
            answer = sum*pow;
        }else if(a==b&&b==c)
        {
            answer = sum*pow*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}