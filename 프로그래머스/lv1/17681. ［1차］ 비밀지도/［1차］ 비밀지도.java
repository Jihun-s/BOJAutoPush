class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] kabedong1 = new String[n][n];
        String[][] kabedong2 = new String[n][n];
        String[] answer = new String[n];

        // arr1 변환
        for (int i = 0; i < n; i++) {
            String kabe = String.format
                ("%" + n + "s", Integer.toBinaryString(arr1[i]));
            for (int j = 0; j < n; j++) {
                kabedong1[i][j] = kabe.charAt(j) == '1' ? "#" : " ";
            }
        }

        // arr2 변환
        for (int i = 0; i < n; i++) {
            String kabe = String.format
                ("%" + n + "s", Integer.toBinaryString(arr2[i]));
            for (int j = 0; j < n; j++) {
                kabedong2[i][j] = kabe.charAt(j) == '1' ? "#" : " ";
            }
        }

        // 두 배열의 결과를 합침
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                // 두 배열 중 하나라도 '#'이면 벽이므로 '#'으로 설정
                if (kabedong1[i][j].equals("#") || kabedong2[i][j].equals("#")) {
                    temp += "#";
                } else {
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}
