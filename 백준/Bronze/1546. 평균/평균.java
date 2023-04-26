import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int n= sc.nextInt();
		double snum =0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++)
		{
			String m = sc.next();
			list.add(m);
		}
		for(String a:list)
		{
			int num = Integer.parseInt(a);
			if(max<num)
			{
				max = num;
			}
		}
		for(String a:list)
		{
			int num = Integer.parseInt(a);
			snum += ((double)num/max*100);
			
		}System.out.println(snum/n);
	}
}