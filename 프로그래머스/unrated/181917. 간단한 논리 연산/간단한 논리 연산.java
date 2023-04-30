class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean left = x1 || x2;
        boolean right = x3 || x4;
        return left && right;
    }
}