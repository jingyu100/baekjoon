import java.io.*;
import java.util.*;

class Main {
    static class Balloon {
        int index;
        int move;

        public Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Balloon> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int move = Integer.parseInt(st.nextToken());
            dq.addLast(new Balloon(i, move));
        }
        Balloon current = dq.pollFirst();
        bw.write(current.index + " ");
        while (!dq.isEmpty()) {
            int move = current.move;
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    dq.addLast(dq.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
            current = dq.pollFirst();
            bw.write(current.index + " ");
        }
        bw.flush();
        bw.close();
    }
}
