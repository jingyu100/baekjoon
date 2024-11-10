import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		LinkedList<Integer> deq = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			deq.add(i);
		}
		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(deq.getFirst() != num) {
				if(deq.indexOf(num) <= (deq.size() / 2)) {
					deq.addLast(deq.getFirst());
					deq.removeFirst();
				}else {
					deq.addFirst(deq.getLast());
					deq.removeLast();
				}
				count++;
			}
			if(deq.getFirst() == num) {
				deq.removeFirst();
			}
		}
		System.out.println(count);
	}

}