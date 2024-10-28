import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (!dq.isEmpty()) bw.write(dq.removeFirst() + "\n");
                    else bw.write("-1\n");
                    break;
                case 4:
                    if (!dq.isEmpty()) bw.write(dq.removeLast() + "\n");
                    else bw.write("-1\n");
                    break;
                case 5:
                    bw.write(dq.size() + "\n");
                    break;
                case 6:
                    bw.write((dq.isEmpty() ? "1" : "0") + "\n");
                    break;
                case 7:
                    if (!dq.isEmpty()) bw.write(dq.getFirst() + "\n");
                    else bw.write("-1\n");
                    break;
                case 8:
                    if (!dq.isEmpty()) bw.write(dq.getLast() + "\n");
                    else bw.write("-1\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
