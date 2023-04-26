import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int s = ((3600*x)+(60*y))-2700;
		if(x==0&&y<45)
		{
			System.out.printf("%d %d",23,60+(s%3600/60));
		}else
		System.out.printf("%d %d",s/3600,s%3600/60);
	}
}