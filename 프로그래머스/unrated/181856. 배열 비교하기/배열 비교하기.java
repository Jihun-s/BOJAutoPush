class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a1 = 0, a2 = 0;
        if(arr1.length!=arr2.length)
        {
            if(arr1.length>arr2.length)
            {
                return 1;
            }else
            {
                return -1;
            }
        }else
        {
            for(int i:arr1)
            {
                a1+=i;
            }
            for(int i:arr2)
            {
                a2+=i;
            }
        }
        if(a1==a2)
        {
            return 0;
        }else if(a1>a2)
        {
            return 1;
        }else if(a1<a2)
        {
            return -1;
        }
        return 0;
    }
}