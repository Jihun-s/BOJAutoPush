import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		long a = Long.parseLong(s1[0]);
		long b = Long.parseLong(s1[1]);
		long c = Long.parseLong(s1[2]);
		System.out.println(a+b+c);
		
	}
}