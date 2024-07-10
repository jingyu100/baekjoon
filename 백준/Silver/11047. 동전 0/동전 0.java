import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		for(int i = n - 1; i >= 0; i--) {
			if(list[i] <= k) {
				cnt += k / list[i];
				k %= list[i];
			}
		}
		System.out.println(cnt);
	}
}