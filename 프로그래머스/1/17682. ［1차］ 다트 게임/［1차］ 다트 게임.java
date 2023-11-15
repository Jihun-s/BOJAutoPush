class Solution {
    public int solution(String dartResult) {
        int answer = 0, a = -1;
        int[] point = new int[3];
        for(int i = 0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                a++;
                if(a>2){
                    break;
                }
                if(dartResult.charAt(i+1) == '0'){
                    point[a] = 10;
                    i++;
                    continue;
                }
                point[a] = dartResult.charAt(i) - '0';
                continue;
            }
            switch(dartResult.charAt(i)){
                case 'S': break;
                case 'D': point[a] = (int)Math.pow(point[a], 2); break;
                case 'T': point[a] = (int)Math.pow(point[a], 3); break;
                case '*': if(a-1>=0){
                    point[a-1] = point[a-1]*2;
                }
                    point[a] = point[a]*2;
                    break;
                case '#': point[a] = point[a]*-1;
                    break;
            }
        }
        for(int i:point){
            answer += i;
        }
        return answer;
    }
}