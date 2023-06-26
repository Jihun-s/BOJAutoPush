import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // completion 배열을 해시 맵에 저장
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        // participant 배열을 반복하며 해시 맵에서 검색
        for (String name : participant) {
            if (!map.containsKey(name) || map.get(name) == 0) {
                answer = name;
                break;
            }
            map.put(name, map.get(name) - 1);
        }
        return answer;
    }
}
