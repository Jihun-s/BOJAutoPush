import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b = sc.nextInt();
		String c = Integer.toString(b);
		
		System.out.println(a*Integer.parseInt(c.substring(2,3)));
		System.out.println(a*Integer.parseInt(c.substring(1,2)));
		System.out.println(a*Integer.parseInt(c.substring(0,1)));
		System.out.println(a*b);
	}
}