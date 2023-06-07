class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int lengthMax = board[0]/2, breadthMax = board[1]/2;
        int length = 0, breadth = 0;
        int[] answer = new int[2];
        for(String s:keyinput){
            switch(s){
                case "left": 
                    if(Math.abs(length)<Math.abs(lengthMax)||length>1){
                        length -= 1;
                    }
                    break;
                case "right":
                    if(Math.abs(length)<Math.abs(lengthMax)||length<-1){
                        length += 1;
                    }
                    break;
                case "up":
                    if(Math.abs(breadth)<Math.abs(breadthMax)||breadth<-1){
                        breadth += 1;
                    }
                    break;
                case "down":
                    if(Math.abs(breadth)<Math.abs(breadthMax)||breadth>1){
                        breadth -= 1;
                    }
                    break;
            }
        }
        answer[0] = length;
        answer[1] = breadth;
        return answer;
    }
}