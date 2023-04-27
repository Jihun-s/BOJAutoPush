import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			String j = sc.next();
			list.add(j);
		}int x = sc.nextInt();
		String b = Integer.toString(x);
		for(String a:list)
		{
			if(a.equals(b))
			{
				count +=1;
			}
		}System.out.println(count);
	}
}