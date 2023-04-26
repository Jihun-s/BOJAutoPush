import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), t = sc.nextInt();
		int textx = 0;
		for(int i =0; i<t; i++)
		{
			int a = sc.nextInt(),b = sc.nextInt();
			textx += (a * b);
		}
		if(textx == x)
		{
			System.out.println("Yes");
		}else
			System.out.println("No");
		
	}
}