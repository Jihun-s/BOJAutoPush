import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        if(str1.length()>=1&&str1.length()<=10&&str2.length()>=1&&str2.length()<=100)
            System.out.printf("%s%s",str1,str2);
    }
}