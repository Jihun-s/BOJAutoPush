class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && b == c && c == d)
        { // 네 주사위가 모두 같은 숫자인 경우
            answer = 1111 * a;
        } else if ((a == b && b == c) || (b == c && c == d) || (c == d && d == a) || (d == a && a == b))
        { // 세 숫자가 같은 경우
            int p, q;
            if (a == b) {
                p = a;
                q = c == d ? c : c == a ? d : c;
            } else if (a == c) {
                p = a;
                q = b == d ? b : b == a ? d : b;
            } else if (a == d) {
                p = a;
                q = b == c ? b : b == a ? c : b;
            } else if (b == c) {
                p = b;
                q = a == d ? a : a == b ? d : a;
            } else if (b == d) {
                p = b;
                q = a == c ? a : a == b ? c : a;
            } else { // c == d
                p = c;
                q = a == b ? a : a == c ? b : a;
            }
            answer = (int) Math.pow(10 * p + q, 2);
        } else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c))
        { // 두 개의 쌍이 각각 같은 경우
            int p, q;
            if (a == b) {
                p = a;
                q = c == d ? c : c == a ? d : c;
            } else if (a == c) {
                p = a;
                q = b == d ? b : b == a ? d : b;
            } else { // a == d
                p = a;
                q = b == c ? b : b == a ? c : b;
            }
            answer = (p + q) * Math.abs(p - q);
        } else if ((a == b) || (a == c) || (a == d)||( b == c)|| ( b == d )||( c == d))
        { // 한 쌍만 같은 경우
            if(a == b)
            {
                answer = c*d;
            }else if (a == c)
            {
                answer = b*d;
            }else if (a == d)
            {
                answer = b*c;
            }else if (b == c)
            {
                answer = a*d;
            }else if (b == d)
            {
                answer = a*c;
            }else if (c == d)
            {
                answer = a*b;
            }
        }else
        {
            int min = Math.min(Math.min(a, b), Math.min(c, d));
            answer = min;
        }
        return answer;
    }
}