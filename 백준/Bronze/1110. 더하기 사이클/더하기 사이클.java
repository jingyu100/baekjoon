import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0;
		int copy = n;
		while (true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
			if (copy == n) {
				break;
			}
		}
		System.out.println(cnt);
	}
}