class Solution {
    public int solution(int[] num_list) {
        int answer = 0, multiple = 1,sum = 0;
		for(int a : num_list)
		{
			multiple *= a;
		}
		for(int a : num_list)
		{
			sum +=a;
		}
		if(multiple<sum*sum)
		{
			answer = 1;
		}else answer = 0;
        
        return answer;
    }
}