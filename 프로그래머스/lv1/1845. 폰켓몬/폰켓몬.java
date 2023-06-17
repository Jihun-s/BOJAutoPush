import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length/2, answer = 0;
        for (int num : nums) {
            set.add(num);
        }
        if(set.size()<=n){
            answer = set.size();
        }else{
            answer = n;
        }
        return answer;
    }
}