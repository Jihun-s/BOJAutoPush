import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for(int i = 0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                {
                answer += Character.toLowerCase(str.charAt(i));
                }
                else
                {
                    answer += Character.toUpperCase(str.charAt(i));
                }
        }
        System.out.print(answer);
    }
}