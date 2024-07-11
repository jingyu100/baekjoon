import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			Collections.reverse(list);
			System.out.println(list.get(2));
		}
	}
}