import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int c = sc.nextInt();
		if(x==y&&y==c)
		{
			System.out.println(10000+(x*1000));
		}else if(x==y||y==c||c==x)
		{
			System.out.println((1000+(x==y? x:c)*100));
		}else if(x>y&&x>c)
		{
			System.out.println(x*100);
		}else
			System.out.println((y>c? y:c)*100);
	}
}