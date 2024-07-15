import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		int max = 0;
		int min = 10000000;
		int maxidx = -1;
		int minidx = -1;
		int mididx = -1;
		for (int i = 0; i < 3; i++) {
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if(list[i] > max) {
				max = list[i];
				maxidx = i;
			}
			if(list[i] < min) {
				min = list[i];
				minidx = i;
			}
		}
		mididx = 3-minidx-maxidx;
		System.out.print(min + " ");
		System.out.print(list[mididx] + " ");
		System.out.print(max);
	}
}