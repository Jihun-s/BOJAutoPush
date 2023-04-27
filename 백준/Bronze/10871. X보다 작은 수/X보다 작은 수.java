import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int n = sc.nextInt(), x=sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			String j = sc.next();
			list.add(j);
		}
		for(String a:list)
		{
			int j = Integer.parseInt(a);
			if(j<x)
			{
				System.out.print(j + " ");
			}
		}
		
	}
}