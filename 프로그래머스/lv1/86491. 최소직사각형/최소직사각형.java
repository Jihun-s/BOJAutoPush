class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0, maxHeight = 0;
        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];
            maxWidth = Math.max(maxWidth, Math.max(width, height));     //최댓값중 제일 큰 수
            maxHeight = Math.max(maxHeight, Math.min(width, height));   //최솟값중 제일 큰 수
        }
        return maxWidth * maxHeight;
    }
}