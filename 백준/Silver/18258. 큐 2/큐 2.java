import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer command;
        Integer num;
        for (int i = 0; i < n; i++) {
            command = new StringTokenizer(br.readLine(), " ");
            switch (command.nextToken()) {
                case "push":
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;
                case "pop":
                    num = q.poll();
                    if (num == null) sb.append(-1).append('\n');
                    else sb.append(num).append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    num = q.peek();
                    if (num == null) sb.append(-1).append('\n');
                    else sb.append(num).append('\n');
                    break;
                case "back":
                    num = q.peekLast();
                    if (num == null) sb.append(-1).append('\n');
                    else sb.append(num).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}