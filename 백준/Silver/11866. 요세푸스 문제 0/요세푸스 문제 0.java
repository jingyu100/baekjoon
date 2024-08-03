import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        System.out.print("<");
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int x = queue.poll();
                queue.offer(x);
            }
            System.out.print(queue.poll() + ", ");
        }
        System.out.print(queue.poll());
        System.out.print(">");
    }
}